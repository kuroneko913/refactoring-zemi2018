package org.speech_lab.refactoring_zemi2018.chapter6;

import java.util.List;
import java.util.ArrayList;

public class Customer {
    private String _name;
    private List<Order> _orders = new ArrayList<Order>();

    public Customer(String name) {
		_name = name;
    }

    public void addOrder(Order arg) {
		_orders.add(arg);
    }

    void printOwing() {
		double outstanding = 0.0;

		// バナーの印刷
		System.out.println("**************************");
		System.out.println("***** Customer Owes ******");
		System.out.println("**************************");

		// 未払金の計算
		for(Order each: _orders) {
			outstanding += each.getAmount();
		}

		// 明細の印刷
		System.out.println("name: " + _name);
		System.out.println("amount: " + outstanding);
    }
}
