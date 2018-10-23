package org.speech_lab.refactoring_zemi2018.chapter8later;

class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("横山");
        Order order = new Order();

        order.setCustomer(customer);
        System.out.println(order.getCustomer().getName() + "によって注文されました");
    }
}
