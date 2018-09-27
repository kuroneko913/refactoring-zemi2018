package org.speech_lab.refactoring_zemi2018.chapter6;

public class ExtractMethod {
    public static void main(String[] args) {
	Customer hiroki = new Customer("森 大毅");

	hiroki.addOrder(new Order(100.0));
	hiroki.addOrder(new Order(23.0));

	hiroki.printOwing();

	Sales monster = new Sales(200, 4);
	System.out.println();
	System.out.println("Price (monster): " + monster.getPrice());

	Sales pen = new Sales(80, 1000);
	System.out.println();
	System.out.println("Bulk price (pen): " + pen.getPrice());
	
	Body haggis = new Body(0.5, 100.0, 50.0, 0.2);
	System.out.println();
	System.out.println("Distance: " + haggis.getDistanceTravelled(0.5));
    }
}
