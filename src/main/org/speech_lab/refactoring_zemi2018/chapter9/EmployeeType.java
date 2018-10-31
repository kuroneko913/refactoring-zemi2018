package chapter9;

import chapter9.employee.Engineer;
import chapter9.employee.Salesman;
import chapter9.employee.Manager;

public abstract class EmployeeType {
    public static final int ENGINEER = 0;
    public static final int SALESMAN = 1;
    public static final int MANAGER = 2;

    public abstract int getTypeCode();

    public static EmployeeType newType(int code){
	switch(code){
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
