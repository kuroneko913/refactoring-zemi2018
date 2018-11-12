package org.speech_lab.refactoring_zemi2018.chapter10;

class Account {
	private int _balance;

	Account(int balance) {
		_balance = balance;
	}
	
	int withdraw(int amount) {
		if (amount > _balance)
			return -1;
		else {
			_balance -= amount;
			return 0;
		}
	}

	int getBalance() {
		return _balance;
	}
}
