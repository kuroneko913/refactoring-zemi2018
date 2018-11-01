package org.speech_lab.refactoring_zemi2018.chapter9;

import java.io.*;

public class Main
{
    public static void main(String[] args)
    {
	/* 条件記述の分解 */
	SeasonCharge season = new SeasonCharge(3.0,"2018/09/02");

	/* 条件記述の統合 */
	Disability disability = new Disability(3,3,false);
	System.out.println("傷病給付金: "+disability.disabilityAmount()+"ドル");

	/* ガード節による入れ子条件記述の置き換え */
	Pay pay = new Pay(false,false,false);
	System.out.println("森本さんの給料は: "+pay.getPayAmount()+"ドル");

	/* ポリモーフィズムによる条件記述の置き換え */
	Employee nakaya = new Employee(Employee.SALESMAN);
	System.out.println("中谷さんの給料は: " + nakaya.payAmount() + "ドル");
	nakaya.setType(Employee.MANAGER);
	System.out.println("昇進した中谷さんの給料は: " + nakaya.payAmount() + "ドル");
	/* ヌルオブジェクトの導入 */
	Student gishi = new Student("高岸", 3.5);
        Laboratory moriLab = new Laboratory("森研究室");
        moriLab.registerStudent(gishi);

        String targetName = "森本";
        Student student = moriLab.getStudent(targetName);

        // ここからのifをなんとかしたい！
        // Double gpa;
        // if(student == null){
        //     gpa = Student.getGPA();
        // } else {
        //     gpa = student.getGPA();
        // }

	Double gpa = student.getGPA();
        // ここまで

        System.out.println(targetName + "さんのGPA: " + gpa.toString());
    }
}
