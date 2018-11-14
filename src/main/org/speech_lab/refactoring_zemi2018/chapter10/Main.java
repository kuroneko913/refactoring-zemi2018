package org.speech_lab.refactoring_zemi2018.chapter10;

import java.util.List;
import java.util.ArrayList;

class Main {
	public static void main(String[] args) {
		System.out.println("*** Chapter10 ***");

		/*メソッド名の変更*/
		Person yokoyama = new Person("横山");
		yokoyama.setOfficeAreaCode("123");
		yokoyama.setOfficeNumber("456-7890");
		System.out.println("名前: "+yokoyama.getName());
		System.out.println("電話番号: "+yokoyama.getTelephoneNumber());
		
		/*問い合わせと更新の分離*/
		ArrayList<String>  miscreantList = new ArrayList<String>();
		miscreantList.add("Don");
		miscreantList.add("Mike");
		miscreantList.add("Kent");
		miscreantList.add("John");
		SecuritySystem security = new SecuritySystem();
		security.checkSecurity(miscreantList);
		
		/*メソッドのパラメタライズ*/
		Employee yamada = new Employee("山田太郎",200000);
		System.out.println(yamada.getName()+"さんの"+"給料は"+yamada.getSalary()+"円");
		yamada.tenpercentRaise();
		System.out.println(yamada.getName()+"さんの"+"給料は"+yamada.getSalary()+"円");
		yamada.fivepercentRaise();
		System.out.println(yamada.getName()+"さんの"+"給料は"+yamada.getSalary()+"円");

		/*オブジェクトそのものの受け渡し*/
		// 暖房計画の温度範囲 
		TempRange plan_temp_range = new TempRange(5,20);
		HeatingPlan heatingPlan = new HeatingPlan(plan_temp_range);
		// 暖房をつけるか考える部屋
		Room myroom = new Room(7,15);
		if (myroom.withinPlan(heatingPlan)) {
			System.out.println("暖房計画を実施します");
		}else {
			System.out.println("暖房計画を実施しません");
		}

		/*メソッドによるパラメータの置き換え*/
		Item item = new Item("apple",100,10);
		System.out.println(item.getName()+":"+item.getPrice());
	  
	}
}
