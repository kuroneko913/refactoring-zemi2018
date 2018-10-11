package org.speech_lab.refactoring_zemi2018.chapter7;

public class Person {
    private String _name;
    private String _officeAreaCode;
    private String _officeNumber;
    private Department _department;
    private TelephoneNumber _telephoneNumber;

    public Person(String name){
        _name = name;
        _telephoneNumber = new TelephoneNumber();
    }

    
    public String getName(){
        return _name;
    }
    
    public String getTelephoneNumber(){
        return ("(" + getOfficeAreaCode() + ")" + getOfficeNumber());
    }
    
    String getOfficeAreaCode(){
        return _telephoneNumber.getOfficeAreaCode();
    }

    void setOfficeAreaCode(String arg){
        _telephoneNumber.setOfficeAreaCode(arg);
    }

    String getOfficeNumber(){
        return _telephoneNumber.getOfficeNumber();
    }

    void setOfficeNumber(String arg){
        _telephoneNumber.setOfficeNumber(arg);
    }

    public Department getDepartment(){
        return _department;
    }

    public void setDepartment(Department arg){
        _department = arg;
    }
}
