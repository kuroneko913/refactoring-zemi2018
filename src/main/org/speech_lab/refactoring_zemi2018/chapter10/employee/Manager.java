package org.speech_lab.refactoring_zemi2018.chapter10.employee;

import org.speech_lab.refactoring_zemi2018.chapter10.Employee;

public class Manager {
	
    public int getType() {
        return Employee.MANAGER;
    }

    public String getCategory() {
        return "Manager";
    }
}
