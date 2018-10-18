package org.speech_lab.refactoring_zemi2018.chapter1;

import java.util.List;
import java.util.ArrayList;

class Customer {
    private String _name;

    // Java 1.5に合わせて改変
    private List<Rental> _rentals = new ArrayList<Rental>();

    public Customer(String name){
        _name = name;
    }

    // Java 1.5に合わせて改変
    public void addRental(Rental arg){
        _rentals.add(arg);
    }

    public String getName(){
        return _name;
    }

    public String statement(){
        String result = "Rental Record for " + getName() + "\n";

        for(Rental rental : _rentals){
            result += "\t" + rental.getMovie().getTitle() + "\t" +
                String.valueOf(rental.getCharge()) + "\n";
        }

        result += "Amount owed is " + String.valueOf(getTotalCharge()) + "\n";
        result += "You earned " + String.valueOf(getFrequentRenterPoints()) +
            " frequent renter points";
        return result;
    }

    double getTotalCharge() {
        double result = 0;

        for(Rental rental : _rentals){
            result += rental.getCharge();
        }

        return result;
    }

    int getFrequentRenterPoints() {
        int result = 0;

        for(Rental rental : _rentals){
            result += rental.getFrequentRenterPoints();
        }

        return result;
    }
}
