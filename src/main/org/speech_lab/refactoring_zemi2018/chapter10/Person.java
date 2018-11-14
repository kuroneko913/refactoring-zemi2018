package org.speech_lab.refactoring_zemi2018.chapter10;

class Person {
	private String _name;
	private TelephoneNumber _telephoneNumber;
	
	public Person(String name) {
		_name = name;
		_telephoneNumber = new TelephoneNumber();
	}

	public String getName() {
		return _name;
	}

	public void setOfficeAreaCode(String arg) {
		_telephoneNumber.setOfficeAreaCode(arg);
	}

	public String getOfficeAreaCode() {
		return _telephoneNumber.getOfficeAreaCode();
	}

	public void setOfficeNumber(String arg) {
		_telephoneNumber.setOfficeNumber(arg);
	}

	public String getOfficeNumber() {
		return _telephoneNumber.getOfficeNumber();
	}

	public String getTelephoneNumber() {
		return ("(" + getOfficeAreaCode() + ")"+ getOfficeNumber());
	}
}
