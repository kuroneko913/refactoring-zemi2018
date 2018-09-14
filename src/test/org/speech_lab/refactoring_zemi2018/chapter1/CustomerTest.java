package org.speech_lab.refactoring_zemi2018.chapter1;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class CustomerTest {
  @Test
  public void statementメソッドが正しい出力を返す(){
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

    String expected = "";
    expected += "Rental Record for foo\n";
    expected += "\tスター・ウォーズ\t2.0\n";
    expected += "\t死霊のはらわた\t3.5\n";
    expected += "\tカメラを止めるな！\t12.0\n";
    expected += "\tプリキュア\t1.5\n";
    expected += "Amount owed is 19.0\n";
    expected += "You earned 5 frequent renter points";

    assertThat(foo.statement(), is(expected));
  }
}
