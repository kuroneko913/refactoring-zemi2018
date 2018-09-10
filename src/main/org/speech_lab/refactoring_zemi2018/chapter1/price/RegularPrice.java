package org.speech_lab.refactoring_zemi2018.chapter1.price;

import org.speech_lab.refactoring_zemi2018.chapter1.Movie;

public class RegularPrice extends Price {
  public int getPriceCode(){
    return Movie.REGULAR;
  }

  public double getCharge(int daysRented){
    double result = 2;
    if(daysRented > 2){
      result += (daysRented - 2) * 1.5;
    }
    return result;
  }
}
