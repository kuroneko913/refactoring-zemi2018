package org.speech_lab.refactoring_zemi2018.chapter8early;

import java.util.Collection;
import java.util.Iterator;

class OrderHistory {
    private static int numberOfOrderFor(Collection orders, String customer) {
        int result = 0;
        Iterator iter = orders.iterator();

        while (iter.hasNext()) {
            Order each = (Order) iter.next();
            if (each.getCustomer().equals(customer)) {
                result++;
            }
        }
        return result;
    }

    public static void printNumOfOrderFor(Collection orders, String customer) {
        System.out.println(customer + " は本システムで" +
                           numberOfOrderFor(orders, customer) +
                           "回注文したことがあります");
    }
}
