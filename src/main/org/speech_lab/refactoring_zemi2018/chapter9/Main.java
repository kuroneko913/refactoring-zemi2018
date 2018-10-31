package chapter9;

import java.io.*;

public class Main
{
    public static void main(String[] args)
    {
	/* 条件記述の分解 */
	SeasonCharge season = new SeasonCharge(300.0,"2018/09/02");
	System.out.println(season.getDate());
	System.out.println("プール使用料金 "+season.getCharge()+"ドル");

	/* 条件記述の統合 */
	Disability disability = new Disability(3,3,false);
	System.out.println("傷病給付金: "+disability.disabilityAmount()+"ドル");

	/* ガード節による入れ子条件記述の置き換え */
	Pay pay = new Pay(false,false,false);
	System.out.println("給料: "+pay.getPayAmount()+"ドル");

	/* ポリモーフィズムによる条件記述の置き換え */
	Employee nakaya = new Employee(Employee.SALESMAN);
	System.out.println("中谷さんの給料は: " + nakaya.payAmount() + "ドル");
	nakaya.setType(Employee.MANAGER);
	System.out.println("昇進した中谷さんの給料は: " + nakaya.payAmount() + "ドル");
	
	
    }
}
