package org.speech_lab.refactoring_zemi2018.chapter10;

class Item {
	private String _itemName;
	private int _itemPrice;
	private int _quantity;

	public Item(String itemName, int itemPrice, int quantity) {
		_itemName = itemName;
		_itemPrice = itemPrice;
		_quantity = quantity;
	}

	public String getName() {
		return _itemName;
	}

	public double getPrice() {
		int basePrice = _quantity * _itemPrice;
		int discountLevel;

		if (_quantity > 100) discountLevel = 2;
		else discountLevel = 1;
		double finalPrice = discountedPrice(basePrice, discountLevel);
		return finalPrice;
	}

	private double discountedPrice(int basePrice, int discountLevel) {
		if (discountLevel == 2) return basePrice * 0.1;
		else return basePrice * 0.05;
	}

}
