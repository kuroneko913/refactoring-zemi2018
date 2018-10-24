package org.speech_lab.refactoring_zemi2018.chapter8later;

import org.speech_lab.refactoring_zemi2018.chapter8later.worker.Engineer;
import org.speech_lab.refactoring_zemi2018.chapter8later.worker.Salesman;
import org.speech_lab.refactoring_zemi2018.chapter8later.worker.Manager;

public abstract class WorkerType {
    public static final int ENGINEER = 0;
    public static final int SALESMAN = 1;
    public static final int MANAGER = 2;
    
    public abstract int getTypeCode();

    public static WorkerType newType(int code) {
        switch (code) {
        case ENGINEER:
            return new Engineer();
        case SALESMAN:
            return new Salesman();
        case MANAGER:
            return new Manager();
        default:
            throw new IllegalArgumentException("不正な従業員コード");
        }
    }
}
