package org.speech_lab.refactoring_zemi2018.chapter9;

import java.util.Arrays;
import java.util.List;

class Student {
    private String _name;
    private double _gpa;

    //デフォルトとは？とは考えないことにする
    public static double DEFAULT_GPA = 2.0;

    public Student(String name, double gpa){
        _name = name;
        _gpa = gpa;
    }

    public String getName(){
        return _name;
    }

    public double getGPA(){
        return _gpa;
    }
}
