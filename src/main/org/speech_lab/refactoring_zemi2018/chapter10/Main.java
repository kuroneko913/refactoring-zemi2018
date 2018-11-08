package org.speech_lab.refactoring_zemi2018.chapter10;

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
		/*メソッドのパラメタライズ*/
		/*明示的なメソッド群によるパラメータの置き換え*/
		/*オブジェクトそのものの受け渡し*/
		/*メソッドによるパラメータの置き換え*/
		/*パラメータオブジェクトの導入*/
		/*Factory Methodによるコンストラクタの置き換え*/
		/*ダウンキャストのカプセル化*/
		/*例外によるエラーコードの置き換え*/
		/*条件判定による例外の置き換え*/
	}
}
