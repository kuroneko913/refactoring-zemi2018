package org.speech_lab.refactoring_zemi2018.chapter10;

import java.util.Date;
import java.util.ArrayList;

class Main {
	public static void main(String[] args) {
		System.out.println("*** Chapter10 ***");
		/*メソッド名の変更*/
		/*メソッドのパラメタライズ*/
		/*明示的なメソッド群によるパラメータの置き換え*/
		/*オブジェクトそのものの受け渡し*/
		/*メソッドによるパラメータの置き換え*/
		/*パラメータオブジェクトの導入*/
		Date startDate = new Date(2018,11-1,1);
		Date endDate = new Date(2018,11-1,15);
		
		Date date0 = new Date(2018,11-1,1);
		Date date1 = new Date(2018,11-1,5);
		Date date2 = new Date(2018,11-1,10);
		
		Entry base = new Entry(20000,date0);
		Entry entry1 = new Entry(19800, date1);
		Entry entry2 = new Entry(2500,date2);
		ArrayList<Entry> entries = new ArrayList<Entry>();
		entries.add(base);
		entries.add(entry1);
		entries.add(entry2);
		Account account = new Account(entries);
		double flow = account.getFlowBetween(startDate,endDate);
		System.out.println(startDate.toString()+"~"+endDate.toString());
		System.out.println("この期間の残高合計は"+flow+"円");
 
		/*Factory Methodによるコンストラクタの置き換え*/
		/*ダウンキャストのカプセル化*/
		/*例外によるエラーコードの置き換え*/
		/*条件判定による例外の置き換え*/
	}
}
