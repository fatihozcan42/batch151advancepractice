package day04;

import java.util.Scanner;

public class AracSigortaApp {
    public static void main(String[] args) {

        start();


    }//main

    private static void start() {
        Scanner input = new Scanner(System.in);
        boolean isFail;
        do {

            isFail = false;
            System.out.println("Lutfen Tarife donemini seciniz\n\t 1==>Haziran 2023\t2==> Aralik 2023");
            int term = input.nextInt();
            if (term == 1 || term == 2) {

                Arac arac = new Arac();
                System.out.println("Lutfen arac tipini giriniz");
                arac.type = input.next().toLowerCase();

                arac.prim = arac.countPrim(term);

                int select; //tamam mi variable
                String termName = term == 1 ? "Haziran 2023" : "Aralik 2013";

                if (arac.prim > 0) {
                    System.out.println("Hesaplama basariyla Tamamlandi");
                    System.out.println("Arac tip : " + arac.type);
                    System.out.println("Tarife donemi : " + termName);
                    System.out.println("Aracinizin sigorta primi odemesi : " + arac.prim);
                    System.out.println("Yeni islem icin ==>1\n Cikmak icin ==> 0 basiniz");
                    select = input.nextInt();//Tamam Mi devam Mi
                    if (select == 1) {
                        isFail = true;
                    } else {
                        isFail = false;
                    }//else
                } else {
                    System.out.println("Hesaplama basarisiz ");
                    System.out.println("Yeni islem icin ==>1 cikis icin==>0 giriniz");
                    select = input.nextInt();
                    if (select == 1) {
                        isFail = true;
                    } else {
                        isFail = false;//uygulamadan cikisi saglanir.
                    }//else
                }


            } else {
                System.out.println("Hatali  giris");
                isFail = true;
            }
        } while (isFail);

    }//start()


}//class
