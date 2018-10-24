package org.speech_lab.refactoring_zemi2018.chapter8later;

public class Worker {
    private int _type;

    private final int _monthlySalary = 1500;
    private final int _comission = 300;
    private final int _bonus = 500;
    
    public static final int ENGINEER = 0;
    public static final int SALESMAN = 1;
    public static final int MANAGER = 2;

    public Worker() {
        super();
    }

    public Worker(int type) {
        _type = type;
    }

    public void setType(int arg) {
        _type = arg;
    }

    public int payAmount() {
        switch (_type) {
        case ENGINEER:
            return _monthlySalary;
        case SALESMAN:
            return _monthlySalary + _comission;
        case MANAGER:
            return _monthlySalary + _bonus;
        default:
            throw new RuntimeException("不正な従業員");
        }
    }
}