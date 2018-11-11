package org.speech_lab.refactoring_zemi2018.chapter10;

import java.util.List;
import java.util.ArrayList;

class Main {
	public static void main(String[] args) {
		System.out.println("*** Chapter10 ***");
		/*メソッドのパラメタライズ*/
		/*明示的なメソッド群によるパラメータの置き換え*/
		
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
		/*パラメータオブジェクトの導入*/
		/*Factory Methodによるコンストラクタの置き換え*/
		/*ダウンキャストのカプセル化*/
		/*例外によるエラーコードの置き換え*/
		/*条件判定による例外の置き換え*/
	}
}
