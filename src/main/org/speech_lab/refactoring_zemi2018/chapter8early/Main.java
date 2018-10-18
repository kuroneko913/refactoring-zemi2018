package org.speech_lab.refactoring_zemi2018.chapter8early;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /* --- 自己カプセル化フィールド --- */
        IntRange range = new IntRange(1, 8);
        int taroAge = 7;
        int jiroAge = 13;
        
        System.out.println("太郎の子供料金チェック: " + range.includes(taroAge));
        System.out.println("次郎の子供料金チェック: " + range.includes(jiroAge));
        range.grow(2);
        System.out.println("適用年齢が拡大されました");
        System.out.println("太郎の子供料金チェック: " + range.includes(taroAge));
        System.out.println("次郎の子供料金チェック: " + range.includes(jiroAge));
        System.out.println();
        
        /* --- オブジェクトによるデータの置き換え & 値から参照への変更 --- */
        Customer.loadCustomer();
        List<Order> orders = new ArrayList<Order>();
        orders.add(new Order("直人"));
        orders.add(new Order("一平"));
        orders.add(new Order("ゆか"));
        orders.add(new Order("一平"));

        OrderHistory.printNumOfOrderFor(orders, "直人");
        OrderHistory.printNumOfOrderFor(orders, "一平");
        System.out.println();
        
        /* --- オブジェクトによる配列の置き換え  --- */
        Performance row = new Performance();
        row.setName("Liverpool");
        row.setWins("15");

        String name = row.getName();
        int wins = row.getWins();

        System.out.println(name + " は " + wins + " 勝した");

        /* --- 観察されるデータの複製 --- */
        IntervalWindow window = new IntervalWindow();
    }
}
