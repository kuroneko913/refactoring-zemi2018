package org.speech_lab.refactoring_zemi2018.chapter10;

import java.utils.Date;

class Entry {
	private Date _chargeDate;
	private double _value;
	
	Entry(double value, Date chargeDate) {
		_value = value;
		_chargeDate = chargeDate;
	}

	Date getDate() {
		return _chargeDate;
	}

	double getValue() {
		return _value;
	}
}
