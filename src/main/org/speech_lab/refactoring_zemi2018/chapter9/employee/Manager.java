package org.speech_lab.refactoring_zemi2018.chapter9.employee;

import org.speech_lab.refactoring_zemi2018.chapter9.Employee;
import org.speech_lab.refactoring_zemi2018.chapter9.EmployeeType;

public class Manager extends EmployeeType{
    @Override
    public int getTypeCode(){
	return Employee.MANAGER;
    }
}
