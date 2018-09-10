package org.speech_lab.refactoring_zemi2018.chapter1.price;

import org.speech_lab.refactoring_zemi2018.chapter1.Movie;

public class NewReleasePrice extends Price {
  public int getPriceCode(){
    return Movie.NEW_RELEASE;
  }

  public double getCharge(int daysRented){
    return daysRented * 3;
  }

  // テキストでは記載ないが、
  // Overrideする場合アノテーションを付けるべき(*)なので追加
  // (*)Effective Javaのどこかにあったはず。あとで調べる。
  @Override
  public int getFrequentRenterPoints(int daysRented){

    // テキストでは3項演算子で記述されている
    // 今回は平易に書いておく
    if(daysRented > 1){
      return 2;
    } else {
      return 1;
    }
  }
}
