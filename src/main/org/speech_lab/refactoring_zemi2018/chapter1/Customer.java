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
    result += "You earned " + String.valueOf(getTotalFrequentRenterPoints()) +
              " frequent renter points";
    return result;
  }

  public String htmlStatement(){
    // テキストの想定HTMLがおそらく古いので改変。
    // テキストの想定するpタグの使用法がよくわからない。誤植の可能性あり。
    String result = "<h1>Rentals for <em>" + getName() + "</em></h1>\n";

    for(Rental rental : _rentals){
      result += "<p>" + rental.getMovie().getTitle() + ": " +
                String.valueOf(rental.getCharge()) + "</p>\n";
    }

    result += "<p>You owe <em>" + String.valueOf(getTotalCharge()) + "</em></p>\n";
    result += "<p>On this rental you earned <em>" +
              String.valueOf(getTotalFrequentRenterPoints()) +
              "</em> frequent renter points</p>";

    return result;
  }

  private double getTotalCharge(){
    double result = 0;
    for(Rental rental : _rentals){
      result += rental.getCharge();
    }

    return result;
  }

  private int getTotalFrequentRenterPoints(){
    int result = 0;
    for(Rental rental : _rentals){
      result += rental.getFrequentRenterPoints();
    }

    return result;
  }
}
