package org.speech_lab.refactoring_zemi2018.chapter7;

class AccountType {
    private boolean _isPremium;

    public AccountType(boolean arg){
	_isPremium = arg;
    }
    
    public boolean isPremium(){
	return _isPremium;
    }
	
}
