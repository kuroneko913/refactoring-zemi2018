package org.speech_lab.refactoring_zemi2018.chapter7;

public class Main {
    public static void main(String[] args){

	AccountType premium = new AccountType(true);
	Account account = new Account(premium, 8, 0.1);
	System.out.println("当座貸越手数料: " + account.overdraftCharge());
	System.out.println("銀行手数料: " + account.bankCharge());
	System.out.println(account.interestForAmount_days(20, 7));

	System.out.println("");
	Person morimoto = new Person("森本", "6122", "4-404");
	System.out.println("名前: " + morimoto.getName());
	System.out.println("電話番号: " + morimoto.getTelephoneNumber());
	System.out.println("オフィスコード: " + morimoto.getOfficeAreaCode());

	System.out.println("");
	Person manager = new Person("森", "6120", "4-415");
	Department speechLab = new Department(manager);
	morimoto.setDepartment(speechLab);
	System.out.println(morimoto.getDepartment().getManager().getName());
       
	    
	// Department department = new Department(manager);
	// System.out.println(morimoto.getDepartment().getManager());
    }

    
}
