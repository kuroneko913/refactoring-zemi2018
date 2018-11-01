package org.speech_lab.refactoring_zemi2018.chapter9;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.io.*;

class SeasonCharge
{
    private int _summerRate = 3;
    private int _winterRate = 2;
    private int _winterServiceCharge = 2;

    private Date _today;

    Date SUMMER_START = toDate("2018/06/01");
    Date SUMMER_END = toDate("2018/08/31");

    public static Date toDate(String str) {
        // 日付フォーマットを作成
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");

        // Date型へ変換
        try {
            return dateFormat.parse(str);
        } catch ( ParseException e ) {
            return null;
        }
    }

    public SeasonCharge(double quantity, String toDay)
    {
	double charge;
	Date date = toDate(toDay);
	
//-------------------------------------------	
	if(NotSummer(date))
	    {
		charge = winterCharge(quantity);
	    }
	else
	    {
		charge = summerCharge(quantity);
	    }

	System.out.println(date);
	System.out.println("プール使用料金: "+charge+"ドル");

    }
//-------------------------------------------

     Boolean notSummer(Date _date) {
	 return (_date.before(SUMMER_START) || _date.after(SUMMER_END));
     }

    double winterCharge(double quantity) {
	return quantity * _winterRate + _winterServiceCharge;
    }

    double summerCharge(double quantity) {
	return quantity * _summerRate;
    }
}
