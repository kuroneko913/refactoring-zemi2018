package org.speech_lab.refactoring_zemi2018.chapter8early;

class Order {
    private Customer _customer;
    
    public Order(String customerName) {
        _customer = Customer.create(customerName);
    }

    public String getCustomerName() {
        return _customer.getName();
    }

    public void setCustomer(String customerName) {
        _customer = Customer.create(customerName);
    }
}
