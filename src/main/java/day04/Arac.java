package day04;

import java.util.Scanner;

public class Arac {


    /*
    Tarife dönemi:Aralık 2023,                      Haziran 2023

       1.dönemi :Haziran   2023                       2.dönem:Aralık 2023
                 otomobil: 2000 TL                    otomobil: 2500  TL
                 kamyon:   3000 TL                    kamyon  : 3500  TL
                 otobüs: tip1: 4000TL                 otobüs: tip1: 4500 TL
                         tip2: 5000TL                         tip2: 5500 TL
                 motosiklet: 1500  TL                 motosiklet: 1750 TL

     */
    public String type;
    public int prim;

    public int countPrim(int term) {//prim hesaplamak icin bir methot olusturduk
        if (term == 1) {
            switch (type.toLowerCase()) {
                case "otomobil":
                    prim = 2000;
                    break;
                case "Kamyon":
                    prim = 3000;
                    break;
                case "otobus":
                    prim = countBusPrim(term);//otobus prımını heaspla methodu
                    break;
                case "motosiklet":
                    prim = 1500;
                    break;
                default:
                    System.out.println("hatalı giris");
                    prim = 0;
                    break;

            }

        } else if (term == 2) {
            switch (type.toLowerCase()) {
                case "otomobil":
                    prim = 2500;
                    break;
                case "Kamyon":
                    prim = 3500;
                    break;
                case "otobus":
                    prim = countBusPrim(term);//otobus prımını heaspla methodu
                    break;
                case "motosiklet":
                    prim = 1750;
                    break;
                default:
                    System.out.println("hatalı giris");
                    prim = 0;
                    break;

            }


        } else {
            System.out.println("Hatalı giris yaptınız");
        }
        return prim;
    }

    public int countBusPrim(int term) { //method olusturduk
        Scanner input = new Scanner(System.in);
        System.out.println("lutfen otobus tipini giriniz\n1==>(18-30)" +
                "\n==>2 (31 ve uzeri koltuklu)");
        String busTypeStr = "";
        while (!busTypeStr.equals("1") && !busTypeStr.equals("2")) {

            try {
                busTypeStr = input.nextLine();
                if (!busTypeStr.equals("1") && !busTypeStr.equals("2")) {
                    System.out.println("hatali giris \nlutfen dogru otobus tipi seciniz");
                }
            } catch (NumberFormatException e) {
                throw new RuntimeException(e);
            }


        }//while
        int busType = Integer.parseInt(busTypeStr);
        prim = busType == 1 ? (term == 1) ? 4000 : 4500 : (term == 1) ? 5000 : 5500;

        return prim;


    }//countBusPrim


}//class