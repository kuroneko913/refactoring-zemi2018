package org.speech_lab.refactoring_zemi2018.chapter8early;

import java.util.Dictionary;
import java.util.Hashtable;

class Customer {

    private final String _name;
    private static Dictionary _instances = new Hashtable();

    public static Customer create(String name) {
        return new Customer(name);
    }
    
    private Customer(String name) {
        _name = name;
    }

    public String getName() {
        return _name;
    }
}
