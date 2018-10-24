package org.speech_lab.refactoring_zemi2018.chapter8later.worker;

import org.speech_lab.refactoring_zemi2018.chapter8later.WorkerType;
import org.speech_lab.refactoring_zemi2018.chapter8later.Worker;

public class Salesman extends WorkerType {
    @Override
    public int getTypeCode() {
        return WorkerType.SALESMAN;
    }
}
