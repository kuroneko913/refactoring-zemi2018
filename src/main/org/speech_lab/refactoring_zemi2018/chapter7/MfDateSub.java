package org.speech_lab.refactoring_zemi2018.chapter7;
import java.util.Date;


public class MfDateSub extends Date {
    public Date nextDay() {
        return new Date(getYear(), getMonth(), getDate()+1);
    }
}
