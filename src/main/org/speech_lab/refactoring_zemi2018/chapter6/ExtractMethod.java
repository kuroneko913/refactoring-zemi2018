package org.speech_lab.refactoring_zemi2018.chapter6;

public class ExtractMethod {
    public static void main(String[] args) {
	Customer hiroki = new Customer("森 大毅");

	hiroki.addOrder(new Order(100.0));
	hiroki.addOrder(new Order(23.0));

	hiroki.printOwing();
    }
}
