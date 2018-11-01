package org.speech_lab.refactoring_zemi2018.chapter9;

import java.util.Map;
import java.util.HashMap;

// Null Object
class NullStudent extends Student {

    //デフォルトとは？とは考えないことにする
    public double DEFAULT_GPA = 4.0;
    
    public NullStudent() {
    }
    
    // public Boolean isNull() {
    // 	return true;
    // }

    @Override
    public double getGPA() {
	return DEFAULT_GPA;
    }
}
