package org.speech_lab.refactoring_zemi2018.chapter1.price;

import org.speech_lab.refactoring_zemi2018.chapter1.Movie;

public class NewReleasePrice extends Price {
  public int getPriceCode(){
    return Movie.NEW_RELEASE;
  }

  public double getCharge(int daysRented){
    return daysRented * 3;
  }

}
