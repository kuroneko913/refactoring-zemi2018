package org.speech_lab.refactoring_zemi2018.chapter8early;

class Customer {

    private final String _name;

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
