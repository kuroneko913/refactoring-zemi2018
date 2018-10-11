package org.speech_lab.refactoring_zemi2018.chapter7;

class AccountType {
    private boolean _isPremium;

    public AccountType(boolean arg){
        _isPremium = arg;
    }
    
    public boolean isPremium(){
        return _isPremium;
    }

    double overdraftCharge(Account account) {
        if (isPremium()) {
            double result = 10;
            if (account.getDaysOverdrawn() > 7){
                result += (account.getDaysOverdrawn() -7) * 0.85;
            }
            return result;
        }
        else{
            return account.getDaysOverdrawn() * 1.75;
        }
    }
}
