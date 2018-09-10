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
    double totalAmount = 0;
    int frequentRenterPoints = 0;
    String result = "Rental Record for " + getName() + "\n";

    for(Rental rental : _rentals){
      double thisAmount = amountFor(rental);

      frequentRenterPoints ++;
      if((rental.getMovie().getPriceCode() == Movie.NEW_RELEASE) &&
          rental.getDaysRented() > 1){
        frequentRenterPoints ++;
      }

      result += "\t" + rental.getMovie().getTitle() + "\t" +
                String.valueOf(thisAmount) + "\n";
      totalAmount += thisAmount;
    }

    result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
    result += "You earned " + String.valueOf(frequentRenterPoints) +
              " frequent renter points";
    return result;
  }

  private double amountFor(Rental rental){
    double thisAmount = 0;
    switch(rental.getMovie().getPriceCode()){
      case Movie.REGULAR:
        thisAmount += 2;
        if(rental.getDaysRented() > 2){
          thisAmount += (rental.getDaysRented() - 2) * 1.5;
        }
        break;
      case Movie.NEW_RELEASE:
        thisAmount += rental.getDaysRented() * 3;
        break;
      case Movie.CHILDRENS:
        thisAmount += 1.5;
        if(rental.getDaysRented() > 3){
          thisAmount += (rental.getDaysRented() - 3) * 1.5;
        }
        break;
    }

    return thisAmount;
  }
}
