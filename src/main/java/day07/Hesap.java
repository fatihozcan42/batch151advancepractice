package day07;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Hesap {

    private ArrayList<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        orders.add(order);
    }

    public double getTotalAmount() {//toplam siparis tutari
        return orders.
                stream().
                mapToDouble(Order::getTotalAmount).
                sum();
    }

    public void printHesap() {
        System.out.println("************* Hesap Fisi *************");
        for (Order order : orders) {
            System.out.println("Siparis Kodu : " + order.getOrderCode());
            System.out.print("Yiyecekler : ");
            HashMap<MenuItem, Integer> items = order.getItems();

            for (Map.Entry<MenuItem, Integer> entry : items.entrySet()) {
                MenuItem item = entry.getKey();
                int adet = entry.getValue();
                System.out.printf("%-20s  %d x  %.2f TL " +//% formatli olarak yazdirir - sola yasla 20 karakter ayir
                        // s==>String d==> tamsayi %.2 virgulden sonra 2 basamak yazdir
                        // f ==> ondalik
                        item.getName(), adet, item.getPrice());//formatli yazdirir.

            }//foreach

            System.out.println(order.getTotalAmount());


        }//for each

        System.out.println(getTotalAmount());//tum yiyecekler

    }


}//class
