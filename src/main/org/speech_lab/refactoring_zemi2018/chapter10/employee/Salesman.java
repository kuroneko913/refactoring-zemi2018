package org.speech_lab.refactoring_zemi2018.chapter10.employee;

import org.speech_lab.refactoring_zemi2018.chapter10.Employee;

public class Salesman extends Employee {

    public int getType() {
        return Employee.SALESMAN;
    }

    public String getCategory() {
        return "Salesman";
    }
}
