package org.speech_lab.refactoring_zemi2018.chapter6;

class Gamma {
    private final Account _account;
    private int inputVal;
    private int quantity;
    private int yearToDate;
    private int importantValue1;
    private int importantValue2;
    private int importantValue3;

    Gamma(Account source, int inputValArg, int quantityArg, int yearToDateArg){
	_account = source;
	inputVal = inputValArg;
	quantity = quantityArg;
	yearToDate = yearToDateArg;
    }

    int compute(){
	importantValue1 = (inputVal * quantity) + _account.delta();
	importantValue2 = (inputVal * yearToDate) + 100;

	// same process (1)
	importantThing();

	importantValue2 *= 11;
	importantValue2 /= 10;

	// same process (2)
	importantThing();

	importantValue3 = importantValue2 * 7;


	return importantValue3 - 2 * importantValue1;
    }

    private void importantThing(){
	if((yearToDate - importantValue1) > 100) 
	    importantValue2 -= 20;
    }


}
