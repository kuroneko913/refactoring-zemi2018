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
	int importantValue1 = (inputVal * quantity) + delta();
	int importantValue2 = (inputVal * yearToDate) + 100;

	// same process (1)
	if((yearToDate - importantValue1) > 100) 
	    importantValue2 -= 20;

	importantValue2 *= 11;
	importantValue2 /= 10;

	// same process (2)
	if((yearToDate - importantValue1) > 100) 
	    importantValue2 -= 20;

	int importantValue3 = importantValue2 * 7;


	return importantValue3 - 2 * importantValue1;
    }

    int delta() {
	int result = 0;
	for(int i = 1; i <= hoge; i++)
	    result += i;
	return result;
    }
}
