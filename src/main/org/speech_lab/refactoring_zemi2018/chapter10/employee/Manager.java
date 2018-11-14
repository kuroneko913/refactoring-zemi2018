package org.speech_lab.refactoring_zemi2018.chapter10.employee;

import org.speech_lab.refactoring_zemi2018.chapter10.EmployeeType;

public class Manager extends EmployeeType {
	
    public int getType() {
        return EmployeeType.MANAGER;
    }

    public String getCategory() {
        return "Manager";
    }
}
