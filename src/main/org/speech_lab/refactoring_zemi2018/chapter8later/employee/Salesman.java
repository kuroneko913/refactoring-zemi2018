package org.speech_lab.refactoring_zemi2018.chapter8later.employee;

import org.speech_lab.refactoring_zemi2018.chapter8later.Employee;

public class Salesman extends Employee {
    @Override
    public int getType() {
        return Employee.SALESMAN;
    }

    @Override
    public String getCategory() {
        return "Salesman";
    }
}
