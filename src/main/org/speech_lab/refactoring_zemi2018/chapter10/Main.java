package org.speech_lab.refactoring_zemi2018.chapter10;

import java.util.List;
import java.util.ArrayList;

class Main {
	public static void main(String[] args) {
		System.out.println("*** Chapter10 ***");
		/*メソッド名の変更*/
		Person yokoyama = new Person("横山");
		yokoyama.setOfficeAreaCode("123");
		yokoyama.setOfficeNumber("456-7890");
		System.out.println("名前: "+yokoyama.getName());
		System.out.println("電話番号: "+yokoyama.getTelephoneNumber());
		
	}
}
