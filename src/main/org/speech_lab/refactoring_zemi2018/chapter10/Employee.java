package org.speech_lab.refactoring_zemi2018.chapter10;

class Employee {
    private String _name;
    private double _salary;
    
    public Employee(String name, double salary) {
	_name = name;
	_salary = salary;
    }
    
    void tenpercentRaise() {
	_salary *= 1.1;
    }

    void fivepercentRaise() {
	_salary *= 1.05;
    }

    public int getSalary() {
	return(int) _salary;
    }

    public String getName() {
	return _name;
    }

}
