package org.speech_lab.refactoring_zemi2018.chapter8early;

class Order {
    private Customer _customer;
    
    public Order(String customer) {
        _customer = new Customer(customer);
    }

    public String getCustomer() {
        return _customer.getName();
    }

    public void setCustomer(String customer) {
        _customer = new Customer(customer);
    }
}
