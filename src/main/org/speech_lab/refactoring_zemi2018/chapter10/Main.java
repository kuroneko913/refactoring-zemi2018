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
		/*ダウンキャストのカプセル化*/
		/*例外によるエラーコードの置き換え*/
		Account myAccount = new Account(15000);
		// 呼び出す側の使い方が悪いので、methodの中で適切な入力が与えられているか判定する必要がある。
		if (myAccount.withdraw(20000) == -1) {
			System.out.println("出金失敗");
		}
		System.out.println("出金後の残高:"+myAccount.getBalance()+"円");
		/*条件判定による例外の置き換え*/
	}
}
