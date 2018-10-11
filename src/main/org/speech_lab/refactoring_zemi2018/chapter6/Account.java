package org.speech_lab.refactoring_zemi2018.chapter6;

class Account {
    int hoge;
    // field definition
    // field definition
    // field definition
    // field definition

    public Account(int initial) {
		hoge = initial;
		// initialization
		// initialization
		// initialization
    }

    int gamma(int inputVal, int quantity, int yearToDate) {
		return new Gamma(this, inputVal, quantity, yearToDate).compute();
    }

    int delta() {
		int result = 0;
		for(int i = 1; i <= hoge; i++)
			result += i;
		return result;
    }
}
