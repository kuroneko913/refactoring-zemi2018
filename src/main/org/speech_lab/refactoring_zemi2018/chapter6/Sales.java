package org.speech_lab.refactoring_zemi2018.chapter6;

class Sales {
    private int _itemPrice;
    private int _quantity;

    public Sales(int itemPrice, int quantity) {
		_itemPrice = itemPrice;
		_quantity = quantity;
    }

    double getPrice() {
		return calcBasePrice() * calcDiscountFactor();
    }

	private int calcBasePrice() {
		return _quantity * _itemPrice;
	}

	private double calcDiscountFactor() {
		if (calcBasePrice() > 1000) {
			return 0.95;
		} else {
			return 0.98;
		}
	}

    double price() {
		// 価格(price)は、基本価格(base price) - 数量割引(quantity) + 送料(shipping)
		return _quantity * _itemPrice -
			Math.max(0, _quantity - 500) * _itemPrice * 0.05 +
			Math.min(_quantity * _itemPrice * 0.1, 100.0);
    }
}
