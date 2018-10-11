package org.speech_lab.refactoring_zemi2018.chapter7;

class AccountType {
    private boolean _isPremium;

    public AccountType(boolean arg){
        _isPremium = arg;
    }
    
    public boolean isPremium(){
        return _isPremium;
    }

    double overdraftCharge(int daysOverdrawn) {
        if (isPremium()) {
            double result = 10;
            if (daysOverdrawn > 7){
                result += (daysOverdrawn -7) * 0.85;
            }
            return result;
        }
        else{
            return daysOverdrawn * 1.75;
        }
    }
}
