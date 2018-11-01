package org.speech_lab.refactoring_zemi2018.chapter9;

import org.speech_lab.refactoring_zemi2018.chapter9.employee.Engineer;
import org.speech_lab.refactoring_zemi2018.chapter9.employee.Salesman;
import org.speech_lab.refactoring_zemi2018.chapter9.employee.Manager;

public class Employee {
    private EmployeeType _type;
    public static final int ENGINEER = 0;
    public static final int SALESMAN = 1;
    public static final int MANAGER = 2;

    private final int _monthlySalary = 1500;
    private final int _commission = 300;
    private final int _bonus = 500;

    public Employee(){
	super();
    }

    public Employee(int type){
	_type = EmployeeType.newType(type);
    }

    public void setType(int arg){
	_type = EmployeeType.newType(arg);
    }

    public int getType(){
	return _type.getTypeCode();
    }

    public int payAmount(){
	return _type.payAmount(this);
    }

    public int getMonthlySalary() {
	return _monthlySalary;
    }

    public int getCommission() {
	return _commission;
    }

    public int getBonus() {
	return _bonus;
    }

    
}
