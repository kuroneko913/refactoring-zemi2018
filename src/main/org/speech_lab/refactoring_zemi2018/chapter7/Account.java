package org.speech_lab.refactoring_zemi2018.chapter7;

public class Account {
    
    private AccountType _type;
    private int _daysOverdrawn;
    private double _interestRate;

    public Account(AccountType arg, int daysOverdrawn, double interestRate){
        _type = arg;
        _daysOverdrawn = daysOverdrawn;
        _interestRate = interestRate;
    }
    
    double bankCharge(){
        double result = 4.5;
        if (_daysOverdrawn > 0){
            result += _type.overdraftCharge(this);
        }
        return result;
    }

    double interestForAmount_days(double amount, int days){
        return _interestRate * amount * days / 365;
    }

    int getDaysOverdrawn() {
        return _daysOverdrawn;
    }
}
