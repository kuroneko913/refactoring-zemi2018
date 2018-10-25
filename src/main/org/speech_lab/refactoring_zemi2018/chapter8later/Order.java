package org.speech_lab.refactoring_zemi2018.chapter8later;


class Order {
    private Customer _customer;
    private String _item;

    Customer getCustomer() {
        return _customer;
    }

    void setCustomer(Customer arg) {
	if (_customer != null){
	    _customer.friendOrders().remove(this);
	}
	_customer = arg;
	if (_customer != null){
	    _customer.friendOrders().add(this);
	}
    }
}
