package org.speech_lab.refactoring_zemi2018.chapter8early;

import java.util.Dictionary;
import java.util.Hashtable;

class Customer {

    private final String _name;
    private static Dictionary _instances = new Hashtable();

    public static Customer create(String name) {
        return (Customer) _instances.get(name);
    }
    
    private Customer(String name) {
        _name = name;
    }

    public String getName() {
        return _name;
    }

    static void loadCustomer() {
        new Customer("直人").store();
        new Customer("一平").store();
        new Customer("ゆか").store();
    }

    private void store() {
        _instances.put(this.getName(), this);
    }
}
