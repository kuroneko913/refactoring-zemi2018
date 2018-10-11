package org.speech_lab.refactoring_zemi2018.chapter7;
import java.util.Date;

public class Main {
    public static void main(String[] args){

        AccountType premium = new AccountType(true);
        Account account = new Account(premium, 8, 0.1);
        System.out.println("銀行手数料: " + account.bankCharge());
        System.out.println("利率: " + account.interestForAmount_days(20, 7));

        System.out.println("");
        Person morimoto = new Person("森本");
        morimoto.setOfficeAreaCode("4-404");
        morimoto.setOfficeNumber("6122");
	
        System.out.println("名前: " + morimoto.getName());
        System.out.println("電話番号: " + morimoto.getTelephoneNumber());

        System.out.println("");
        Person manager = new Person("森");
        Department speechLab = new Department(manager);
        morimoto.setDepartment(speechLab);
        System.out.println(morimoto.getDepartment().getManager().getName());

        System.out.println("");
        Date today = new Date();
        Date tomorrow = new Date(today.getYear(), today.getMonth(), today.getDate() + 1);
        System.out.println(tomorrow.getYear() + "年" + tomorrow.getMonth() + "月" + tomorrow.getDate() + "日");
       
	    
        // Department department = new Department(manager);
        // System.out.println(morimoto.getDepartment().getManager());
    }

    
}
