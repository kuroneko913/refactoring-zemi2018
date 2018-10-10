package org.speech_lab.refactoring_zemi2018.chapter7;

public class Department{
    private String _chargeCode;
    private Person _manager;

    public Department(Person manager){
	_manager = manager;
    }

    public Person getManager(){
	return _manager;
    }
}
