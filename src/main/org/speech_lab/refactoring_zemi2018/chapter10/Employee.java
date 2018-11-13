package org.speech_lab.refactoring_zemi2018.chapter10;

class Employee {

	static final int ENGINEER = 0;
	static final int SALESMAN = 1;
	static final int MANAGER = 2;

	private int _type;

	public Employee(int type) {
		_type = type;
	}

	static Employee create(int type) {
		return new Employee(type);
	}
}
