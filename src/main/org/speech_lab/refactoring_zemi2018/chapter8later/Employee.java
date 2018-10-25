package org.speech_lab.refactoring_zemi2018.chapter8later;

import org.speech_lab.refactoring_zemi2018.chapter8later.employee.Engineer;
import org.speech_lab.refactoring_zemi2018.chapter8later.employee.Salesman;
import org.speech_lab.refactoring_zemi2018.chapter8later.employee.Manager;

public abstract class Employee {
    private int _type;

    public static final int ENGINEER = 0;
    public static final int SALESMAN = 1;
    public static final int MANAGER = 2;

    public static Employee create(int type){
	switch (type)
	    {
	    case ENGINEER:
		return new Engineer();
	    case SALESMAN:
		return new Salesman();
	    case MANAGER:
		return new Manager();
	    default:
		throw new IllegalArgumentException("不正なタイプコード");
	    }
    }

  

    public abstract int getType();
    public abstract String getCategory();
}
