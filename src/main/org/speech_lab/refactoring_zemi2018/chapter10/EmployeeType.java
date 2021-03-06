package org.speech_lab.refactoring_zemi2018.chapter10;

import org.speech_lab.refactoring_zemi2018.chapter10.employee.Engineer;
import org.speech_lab.refactoring_zemi2018.chapter10.employee.Salesman;
import org.speech_lab.refactoring_zemi2018.chapter10.employee.Manager;

public abstract class EmployeeType {

	public static final int ENGINEER = 0;
	public static final int SALESMAN = 1;
	public static final int MANAGER = 2;

	private int _type;

	// private Employee(int type) {
	// 	_type = type;
	// }

	public static EmployeeType create(int type) {
		switch (type) {
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
