package org.speech_lab.refactoring_zemi2018.chapter7;

public class Main {
    public static void main(String[] args){

	AccountType premium = new AccountType(true);
	Account account = new Account(premium, 8);
	System.out.println(account.overdraftCharge());
	System.out.println(account.bankCharge());
	
	Person morimoto = new Person("森本", "123", "456");
	System.out.println(morimoto.getName());
	System.out.println(morimoto.getTelephoneNumber());
	System.out.println(morimoto.getOfficeAreaCode());
    }

    
}
