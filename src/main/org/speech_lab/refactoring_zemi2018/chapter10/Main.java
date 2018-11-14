package org.speech_lab.refactoring_zemi2018.chapter10;

import java.util.List;
import java.util.ArrayList;
import java.util.Stack;
import java.util.EmptyStackException;

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
