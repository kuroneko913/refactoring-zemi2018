package org.speech_lab.refactoring_zemi2018.chapter6;

class Sales {
    private int _itemPrice;
    private int _quantity;

    public Sales(int itemPrice, int quantity) {
	_itemPrice = itemPrice;
	_quantity = quantity;
    }

    double getPrice() {
	int basePrice = _quantity * _itemPrice;
	double discountFactor;
	if(basePrice > 1000)
	    discountFactor = 0.95;
	else
	    discountFactor = 0.98;
	return basePrice * discountFactor;
    }
}
