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
    int frequentRenterPoints = 0;
    String result = "Rental Record for " + getName() + "\n";

    for(Rental rental : _rentals){
      frequentRenterPoints += rental.getFrequentRenterPoints();
      result += "\t" + rental.getMovie().getTitle() + "\t" +
                String.valueOf(rental.getCharge()) + "\n";
    }

    result += "Amount owed is " + String.valueOf(getTotalCharge()) + "\n";
    result += "You earned " + String.valueOf(frequentRenterPoints) +
              " frequent renter points";
    return result;
  }

  private double getTotalCharge(){
    double result = 0;
    for(Rental rental : _rentals){
      result += rental.getCharge();
    }

    return result;
  }
}
