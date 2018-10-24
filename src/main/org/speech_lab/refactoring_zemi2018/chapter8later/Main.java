package org.speech_lab.refactoring_zemi2018.chapter8later;

import java.util.Set;
import java.util.HashSet;

class Main {
    public static void main(String[] args) {
        /* --- 単方向関連の双方向への変更 --- */
        Customer customer = new Customer("永田");
        Order order = new Order();

        order.setCustomer(customer);
        System.out.println(order.getCustomer().getName() +
                           "が商品を注文しました\n");

        /* --- コレクションのカプセル化 --- */
        Person<Course> kent = new Person<Course>();
        Set<Course> s = new HashSet<Course>();

        s.add(new Course("線形代数", false));
        s.add(new Course("機械学習", true));
        kent.setCourses(s);

        Course refact = new Course("リファクタリング", true);
        kent.getCourses().add(refact);
        kent.getCourses().add(new Course("プログラミングの基礎", false));
        kent.getCourses().remove(refact);

        System.out.println("応用コースを" + kent.countAdvancedCourses() +
                           "個受講しています\n");

        /* --- クラスによるタイプコードの置き換え --- */
        Item book = new Item(Item.TYPECODE_BOOK, "やさしいJava", 2600);
        Item dvd = new Item(Item.TYPECODE_DVD, "劇場版アイカツ! 超豪華版", 12000);
        Item soft = new Item(Item.TYPECODE_SOFT, "腐り姫", 8800);

        System.out.println("BOOK = " + book.toString());
        System.out.println("DVD  = " + dvd.toString());
        System.out.println("SOFT = " + soft.toString());
        System.out.println();

        /* --- サブクラスによるタイプコードの置き換え --- */
        Employee kousiro = new Employee(Employee.ENGINEER);
        Employee daitoku = new Employee(Employee.SALESMAN);
        Employee senomiya = new Employee(Employee.MANAGER);

        System.out.println("神代: " + kousiro.getCategory());
        System.out.println("大徳: " + daitoku.getCategory());
        System.out.println("瀬乃宮: " + senomiya.getCategory());
        System.out.println();

        /* --- State/Strategyによるタイプコードの置き換え --- */
        Worker kousaku = new Worker(Worker.SALESMAN);
        System.out.println("耕作の給料は" + kousaku.payAmount() + "ドル");
        kousaku.setType(Worker.MANAGER);
        System.out.println("昇進した耕作の給料は" + kousaku.payAmount() + "ドル\n");

        /* --- フィールドによるサブクラスの置き換え --- */
        User rin = new Female();
        User ren = new Male();
        System.out.println("リン: " + rin.getCode());
        System.out.println("レン: " + ren.getCode());
    }
}
