package day07;

import java.util.ArrayList;
import java.util.Scanner;

public class Restaurant {
    private ArrayList<MenuItem> menu = new ArrayList<>();
    private static ArrayList<Order> orders = new ArrayList<>();

    public void addMenuItem(MenuItem item) {
        menu.add(item);
    }

    public void remove(MenuItem item) {
        menu.remove(item);
    }

    public static void main(String[] args) {

        MenuItem item1 = new MenuItem(101, "Hamburger", 500.00);
        MenuItem item2 = new MenuItem(102, "Pizza", 600.00);
        MenuItem item3 = new MenuItem(103, "Kofte", 700.00);
        MenuItem item4 = new MenuItem(104, "Salata", 100.00);


        //Restaurant nesnesi olusturuyoruz. menu ogelerini ekledik
        Restaurant restaurant = new Restaurant();
        restaurant.addMenuItem(item1);
        restaurant.addMenuItem(item2);
        restaurant.addMenuItem(item3);
        restaurant.addMenuItem(item4);

        Scanner input = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("************* RESTAURANT SIPARIS SISTEMI *****************");
            System.out.println("1 - MENUYU GOSTER");
            System.out.println("2 - SIPARIS OLUSTUR");
            System.out.println("3 - SIPARIS IPTAL ET");
            System.out.println("4 - SIPARISLERI GOSTER");
            System.out.println("5 - HESAP FISI YAZDIR");
            System.out.println("0 - CIKIS");
            System.out.println("SECIMINIZ : ");
            int chose = input.nextInt();
            switch (chose) {
                case 0:
                    exit = true;
                    break;
                case 1:
                    restaurant.displayMenu();
                    break;
                case 2:
                    System.out.println("yiyecek kodunu giriniz");
                    int code = input.nextInt();
                    System.out.println("Kac adet istiyorsunuz");
                    int adet = input.nextInt();
                    restaurant.createOrder(code, adet);

                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Gecersiz secim");

            }
        }


    }//main

    private void displayMenu() {
        System.out.println("********** MENU *************");

        //KOD  Yiyecek fiyat
        System.out.printf("%-10s   %-30s  %s\n", "KOD", "Yiyecek Ismi", "Fiyat");
        for (MenuItem item : menu) {
            System.out.printf("%-10d %-30s  %.2f\n ", item.getCode(), item.getName(), item.getPrice());
        }
    }//displayMenu()

    private void createOrder(int code, int adet){
       MenuItem item = menu.
                stream().
                filter(t->t.getCode()==code).
                findFirst().
                orElse(null);

       if (item != null){//item varsa
           Order order = new Order();
           order.addItem(item,adet);
           orders.add(order);
           remove(item);//silmek istiyorsa kaldiracak.
           System.out.printf("Siparis olusturuldu. siparis kodu %d\n : " +order.getOrderCode());

       }else {
           System.out.println("Yanlis kod girdiniz");
       }


    }//createOrder()


}//class
