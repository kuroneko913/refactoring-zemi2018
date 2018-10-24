package org.speech_lab.refactoring_zemi2018.chapter8later;

class Employee {
    private int _type;

    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;

    public Employee(int type) {
        _type = type;
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
