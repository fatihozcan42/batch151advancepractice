package day05;

import java.util.Random;

public class RandomClassi {

    public static void main(String[] args) {
        Random rnd = new Random();
        int sayi;

        sayi = rnd.nextInt();
        System.out.println("sayi :  " + sayi);//- 2 milyar ile +2 milyar arasndaki sayilardan birini bize verir

        int sayi1 = rnd.nextInt(5);//0,1,2,3,4 [0,5) arasindaki degerlerden birini dondurur.

        //  int sayi1 = rnd.nextInt(n)+m; 0+m,1+m,2+m,3+m,4+m [0,5]==>m kaydirma degeri
        int sayi2 = rnd.nextInt(5) + 2;
        System.out.println(sayi2);//2,3,4,5,6,

        int sayi3 = 3 * rnd.nextInt(5) + 2; //3* saylar arasindaki mesafeyi gosterir.
        System.out.println("Sayi3 : " + sayi3);//2,5,8,11,14,

        int max = 10;
        int min = 5;

        int sayi4 = rnd.nextInt(max);//0,1,2,3,4,5,6,7,8,9 [0,max)
        System.out.println("Sayi4 : " + sayi4);

        int sayi5 = rnd.nextInt(max + 1);//0,1,2,3,4,5,6,7,8,9 [0,max]
        System.out.println("sayi5 : " + sayi5);

        int sayi6 = rnd.nextInt(max + 1) + min;//5,6,7,8,9,10,11,12,13,14,15
        System.out.println("Sayi 6 : " + sayi6);

        int sayi7 = rnd.nextInt(max + 1 - min) + min;//5,6,7,8,9,10,

        System.out.println("Sayi 7 : " + sayi7);

    }//main

}//class
