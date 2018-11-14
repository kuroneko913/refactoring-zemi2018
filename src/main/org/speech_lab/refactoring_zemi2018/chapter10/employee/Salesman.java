package org.speech_lab.refactoring_zemi2018.chapter10.employee;

import org.speech_lab.refactoring_zemi2018.chapter10.EmployeeType;

public class Salesman extends EmployeeType {

    public int getType() {
        return EmployeeType.SALESMAN;
    }

    public String getCategory() {
        return "Salesman";
    }
}
