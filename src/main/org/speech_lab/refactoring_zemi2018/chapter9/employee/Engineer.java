package chapter9.employee;

import chapter9.Employee;
import chapter9.EmployeeType;

public class Engineer extends EmployeeType{
    @Override
    public int getTypeCode(){
	return Employee.ENGINEER;
    }
}
