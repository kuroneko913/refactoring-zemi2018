package chapter9;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.io.*;

class SeasonCharge
{
    private double charge;
    private int _summerRate = 3;
    private int _winterRate = 2;
    private int _winterServiceCharge = 200;

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

    private double _charge;
    private Date _today;

    Date SUMMER_START = toDate("2018/06/01");
    Date SUMMER_END = toDate("2018/08/31");
    
    public SeasonCharge(double quantity, String toDay)
    {
	
	Date date = toDate(toDay);
//-------------------------------------------	
	if(date.before(SUMMER_START) || date.after(SUMMER_END))
	    {
		charge = quantity * _winterRate + _winterServiceCharge;
	    }
	else
	    {
		charge = quantity * _summerRate;
	    }
	_today = date;
	_charge = charge;
    }
//-------------------------------------------

    double getCharge()
    {
	return _charge;
    }

    Date getDate()
    {
	return _today;
    }

   

}
