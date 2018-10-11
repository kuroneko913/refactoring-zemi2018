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
    
    double overdraftCharge(){
        if (_type.isPremium()){
            double result = 10;
            if (_daysOverdrawn > 7){
                result += (_daysOverdrawn -7) * 0.85;
            }
            return result;
        }
        else{
            return _daysOverdrawn * 1.75;
        }
    }

    double bankCharge(){
        double result = 4.5;
        if (_daysOverdrawn > 0){
            result += overdraftCharge();
        }
        return result;
    }

    double interestForAmount_days(double amount, int days){
        return _interestRate * amount * days / 365;
    }
}
