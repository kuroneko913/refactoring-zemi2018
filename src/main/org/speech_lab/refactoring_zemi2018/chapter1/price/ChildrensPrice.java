package org.speech_lab.refactoring_zemi2018.chapter1.price;

import org.speech_lab.refactoring_zemi2018.chapter1.Movie;

public class ChildrensPrice extends Price {
  public int getPriceCode(){
    return Movie.CHILDRENS;
  }

  public double getCharge(int daysRented){
    double result = 1.5;
    if(daysRented > 3){
      result += (daysRented - 3) * 1.5;
    }
    return result;
  }
}
