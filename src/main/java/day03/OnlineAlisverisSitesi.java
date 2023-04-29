package day03;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OnlineAlisverisSitesi {
    static Scanner input = new Scanner(System.in);
    static List<String> urunListesi = new ArrayList<>();
    static List<Double> urunFiyatlari = new ArrayList<>();
    static double odenecekMiktar;


    public static void main(String[] args) {
        urunListesi.add("saat Urun Kodu 0");
        urunListesi.add("Monitor Urun Kodu 1");
        urunListesi.add("Canta Urun Kodu 2");
        urunListesi.add("TV Urun Kodu 3");
        urunListesi.add("Kitap Urun Kodu 4");

        urunFiyatlari.add(150.0);
        urunFiyatlari.add(3000.0);
        urunFiyatlari.add(5000.0);
        urunFiyatlari.add(6000.0);
        urunFiyatlari.add(100.0);

        List<String> yeniUruler = new ArrayList<>();
        yeniUruler.add("Taki UrunKodu 5");
        yeniUruler.add("Tencere UrunKodu 6");
        yeniUruler.add("Kiyafet UrunKodu 7");

        urunListesi.addAll(yeniUruler);

        List<Double> yeniUrunFiyatlari = new ArrayList<>();
        yeniUrunFiyatlari.add(9000.0);
        yeniUrunFiyatlari.add(200.0);
        yeniUrunFiyatlari.add(400.0);

        urunFiyatlari.addAll(yeniUrunFiyatlari);

        musteriSecim();
    }//main


    public static void musteriSecim() {
        urunListesiniGoster();
        System.out.println("Lutfen urun kodunu giriniz");
        int urunKodu = input.nextInt();
        if (urunKodu >= 0 && urunKodu <= urunListesi.size()) {
            System.out.println("Kac adet istediginizi giriniz");
            int adet = input.nextInt();
            double toplamUrunFiyati = urunFiyatlari.get(urunKodu) * adet;
            odenecekMiktar += toplamUrunFiyati;
            devamMi();
        } else {
            System.out.println("Lutfen gecerli bir urun kodu giriniz");
            musteriSecim();//Recursive Method

        }
    }//musteriSecim()

    public static void devamMi() {
        System.out.println("alisverise devam etmek istiyor musunuz?\nEvet ise ==> 1\n hayir ise ==> 2");
        int devamMi = input.nextInt();
        if (devamMi == 1) {
            musteriSecim();
        } else if (devamMi == 2) {
            odemeYap();
        } else {
            System.out.println("Gecerli bir secenek giriniz");
            devamMi();//Recursive method
        }
    }

    private static void odemeYap() {
        LocalDate kurulusGunu = LocalDate.of(2023, 4, 21);
        LocalDate date = LocalDate.now();
        if (date.isEqual(kurulusGunu)) {
            slowPrintln("TechPro Alisveris sitesine hosgeldiniz." +
                    "\n Bugun kurulus yil donumu.\nBorcunuz yoktur", 80);
        } else {
            slowPrintln("TEcpro alisveris sitesini tercih ettiginiz icin\n" +
                    "tesekkur ederiz", 80);
            System.out.println();
            System.out.println("Odeme yapilacak tutar " + odenecekMiktar + " TL'dir.");
        }
    }

    private static void slowPrintln(String metin, int gecikme) {
        for (char ch : metin.toCharArray()) {
            System.out.print(ch);
            try {
                Thread.sleep(gecikme);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }//foreach

    }//slowPrintln

    public static void urunListesiniGoster() {
        System.out.println("**********Urun Listesi***********");
        for (int i = 0; i < urunListesi.size(); i++) {
            System.out.println(i + "-" + urunListesi.get(i) + " Fiyat " + urunFiyatlari.get(i) + " TL");
        }//fori
    }//urunListesiniGoster
}//class
