package org.speech_lab.refactoring_zemi2018.chapter10;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.util.Stack;
import java.util.EmptyStackException;

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
	    EmployeeType engineer = EmployeeType.create(EmployeeType.ENGINEER);
	    EmployeeType salesman = EmployeeType.create(EmployeeType.SALESMAN);
	    EmployeeType manager = EmployeeType.create(EmployeeType.MANAGER);
	    System.out.println("従業員:"+engineer.getCategory());
	    System.out.println("従業員:"+salesman.getCategory());
	    System.out.println("従業員:"+manager.getCategory());
		
	    /*例外によるエラーコードの置き換え*/
	    BankAccount myAccount = new BankAccount(15000);
	    if (myAccount.withdraw(20000) == -1) {
		System.out.println("出金失敗");
	    }
	    System.out.println("出金後の残高:"+myAccount.getBalance()+"円");
		
	    /*条件判定による例外の置き換え*/
	    // Portの割り当て? (1~5)
	    Stack available = new Stack();
	    Stack allocated = new Stack();
	    for (int i=0;i<2;i++) {
		Resource resource = new Resource();
		System.out.println("Resource(available):"+resource.get());
		available.push(resource);
	    }
	    System.out.println("Resource(allocated):"+allocated);
	    ResourcePool resourcepool = new ResourcePool(available,allocated);
	    for (int i=0;i<4;i++) {
		Resource result = resourcepool.getResource();
		System.out.println("Resource(allocated):"+result.get());
	    }
	}
}
