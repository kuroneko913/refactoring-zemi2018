package org.speech_lab.refactoring_zemi2018.chapter8later;

import org.speech_lab.refactoring_zemi2018.chapter8later.employee.Engineer;
import org.speech_lab.refactoring_zemi2018.chapter8later.employee.Salesman;
import org.speech_lab.refactoring_zemi2018.chapter8later.employee.Manager;

public class Employee {
    private int _type;

    public static final int ENGINEER = 0;
    public static final int SALESMAN = 1;
    public static final int MANAGER = 2;

    public Employee() {
        super();
    }

    public Employee(int type) {
        _type = type;
    }

    public int getType() {
        return _type;
    }

    public String getCategory() { // こういうswitch文が乱用されそう
        switch (_type) {
        case ENGINEER:
            return "Engineer";
        case SALESMAN:
            return "Salesman";
        case MANAGER:
            return "Manager";
        default:
            return null;
        }
    }
}
