package org.speech_lab.refactoring_zemi2018.chapter1.price;

import org.speech_lab.refactoring_zemi2018.chapter1.Movie;

public class ChildrensPrice extends Price {
  public int getPriceCode(){
    return Movie.CHILDRENS;
  }
}
