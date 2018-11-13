package org.speech_lab.refactoring_zemi2018.chapter10.employee;

import org.speech_lab.refactoring_zemi2018.chapter10.Employee;

public class Engineer extends Employee {
  
    public int getType() {
        return Employee.ENGINEER;
    }

    public String getCategory() {
        return "Engineer";
    }
}
