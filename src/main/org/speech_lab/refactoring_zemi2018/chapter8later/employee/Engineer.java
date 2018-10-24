package org.speech_lab.refactoring_zemi2018.chapter8later.employee;

import org.speech_lab.refactoring_zemi2018.chapter8later.Employee;

public class Engineer extends Employee {
    @Override
    public int getType() {
        return Employee.ENGINEER;
    }

    @Override
    public String getCategory() {
        return "Engineer";
    }
}
