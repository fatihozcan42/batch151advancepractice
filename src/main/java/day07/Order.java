package day07;

import java.util.HashMap;

public class Order {

    private static int orderCount = 1000;
    private int orderCode;
    private HashMap<MenuItem, Integer> items = new HashMap<>();//items HashMap'inin icersinde (pizza, 2 adet)
    private double totalAmount=0;
    public Order() {
       orderCode = orderCount++;
    }

    public void addItem(MenuItem item,int adet){
        items.put(item,adet);//items secenekler hashMap'ine arguman oalrak verilen item secenek eklenir.
        totalAmount += item.getPrice()*adet;
    }
    public int getOrderCode() {
        return orderCode;
    }

    public HashMap<MenuItem, Integer> getItems() {//yiyecekler ve kacar adet sparis veildigi bilgisi var.
        return items;
    }

    public double getTotalAmount() {
        return totalAmount;
    }
}//class
