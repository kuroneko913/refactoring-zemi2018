package org.speech_lab.refactoring_zemi2018.chapter10;

import java.util.List;
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
		/*Factory Methodによるコンストラクタの置き換え*/
		Employee engineer = new Employee(Employee.ENGINEER);
		Employee salesman = new Employee(Employee.SALESMAN);
		Employee manager = new Employee(Employee.MANAGER);
		// Employee engineer = Employee.create(Employee.ENGINEER);
		// Employee salesman = Employee.create(Employee.SALESMAN);
 		// Employee manager = Employee.create(Employee.MANAGER);
		
		/*ダウンキャストのカプセル化*/
		/*例外によるエラーコードの置き換え*/
		/*条件判定による例外の置き換え*/
	}
}
