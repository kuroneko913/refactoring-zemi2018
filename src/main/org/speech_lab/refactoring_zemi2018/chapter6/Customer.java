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

	void printBanner() {
		System.out.println("**************************");
		System.out.println("***** Customer Owes ******");
		System.out.println("**************************");		
	}

	void printDetails(double outstanding) {
		System.out.println("name: " + _name);
		System.out.println("amount: " + outstanding);		
	}

	double getOutstanding() {
		double result = 0.0;

		for (Order each: _orders) {
			result += each.getAmount();
		}
		return result;
	}

    void printOwing() {
		double outstanding = getOutstanding();

		printBanner();
		printDetails(outstanding);
    }
}
