package org.speech_lab.refactoring_zemi2018.chapter9;

import org.speech_lab.refactoring_zemi2018.chapter9.employee.Engineer;
import org.speech_lab.refactoring_zemi2018.chapter9.employee.Salesman;
import org.speech_lab.refactoring_zemi2018.chapter9.employee.Manager;

public class Employee {
    private EmployeeType _type;

    private final int _mouthlySalary = 1500;
    private final int _comission = 300;
    private final int _bonus = 500;

    public static final int ENGINEER = 0;
    public static final int SALESMAN = 1;
    public static final int MANAGER = 2;

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
	switch(getType())
	    {
	    case ENGINEER:
		return _mouthlySalary;
	    case SALESMAN:
		return _mouthlySalary + _comission;
	    case MANAGER:
		return _mouthlySalary + _bonus;
	    default:
		throw new RuntimeException("不正なタイプコード");
	    }
    }
}
