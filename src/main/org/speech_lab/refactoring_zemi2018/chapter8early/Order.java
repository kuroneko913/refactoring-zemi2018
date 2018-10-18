package org.speech_lab.refactoring_zemi2018.chapter8early;

class Order {
    private String _customer;
    
    public Order(String customer) {
        _customer = customer;
    }

    public String getCustomer() {
        return _customer;
    }

    public void setCustomer(String arg) {
        _customer = arg;
    }
}
