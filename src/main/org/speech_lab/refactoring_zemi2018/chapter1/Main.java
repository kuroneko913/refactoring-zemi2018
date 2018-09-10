package org.speech_lab.refactoring_zemi2018.chapter1;

class Main {
  public static void main(String[] args){
    Movie harawata = new Movie("死霊のはらわた", 0);
    Movie starwars = new Movie("スター・ウォーズ", 0);

    Movie kametome = new Movie("カメラを止めるな！", 1);
    Movie kanzou = new Movie("君の肝臓を食べたい", 1);

    Movie shinchan = new Movie("クレヨンしんちゃん", 2);
    Movie precure = new Movie("プリキュア", 2);

    Customer foo = new Customer("foo");
    foo.addRental(new Rental(starwars, 1));
    foo.addRental(new Rental(harawata, 3));
    foo.addRental(new Rental(kametome, 4));
    foo.addRental(new Rental(precure, 1));

    System.out.println(foo.statement());
  }
}
