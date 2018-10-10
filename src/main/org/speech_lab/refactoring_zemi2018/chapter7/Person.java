package org.speech_lab.refactoring_zemi2018.chapter7;

public class Person {
    private String _name;
    private String _officeAreaCode;
    private String _officeNumber;
    private Department _department;

    public Person(String name, String officeAreaCode, String officeNumber){
	_name = name;
	_officeAreaCode = officeAreaCode;
	_officeNumber = officeNumber;
    }

    
    public String getName(){
	return _name;
    }
    
    public String getTelephoneNumber(){
	return ("(" + _officeAreaCode + ")" + _officeNumber);
    }
    
    String getOfficeAreaCode(){
	return _officeAreaCode;
    }

    void setOfficeaAreaCode(String arg){
	_officeAreaCode = arg;
    }

    String getOfficeNumber(){
	return _officeNumber;
    }

    void setOfficeNumber(String arg){
	_officeNumber = arg;
    }

    public Department getDepartment(){
	return _department;
    }

    public void setDepartment(Department arg){
	_department = arg;
    }
    
}
