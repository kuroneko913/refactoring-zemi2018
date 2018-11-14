package org.speech_lab.refactoring_zemi2018.chapter10.employee;

import org.speech_lab.refactoring_zemi2018.chapter10.EmployeeType;

public class Engineer extends EmployeeType {
  
    public int getType() {
        return EmployeeType.ENGINEER;
    }

    public String getCategory() {
        return "Engineer";
    }
}
