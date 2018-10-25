package org.speech_lab.refactoring_zemi2018.chapter8later;

import java.util.Set;
import java.util.HashSet;

class Customer {
    private final String _name;
    private Set<Order> _orders = new HashSet<Order>();

    Set<Order> friendOrders()
    {
	return _orders;
    }
    
    public Customer(String name) {
        _name = name;
    }

    public String getName() {
        return _name;
    }
}
