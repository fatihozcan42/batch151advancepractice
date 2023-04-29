package day01;

public class C03_Russuleti {
public static void main(String[] args) {
        int ilkSayi = -455;//-99645
        int ikinciSayi = 219;


        System.out.println(carpim(ilkSayi, ikinciSayi));

        }
public static int carpim(int ilkSayi, int ikinciSayi) {
        boolean negatif = false;
        if(ilkSayi<0){
        ilkSayi= -ilkSayi;
        negatif =! negatif;
        }
        if(ikinciSayi<0){
        ikinciSayi= -ikinciSayi;
        negatif =! negatif;
        }

        int toplam = 0;
        do{


        if(ilkSayi %2 !=0){//ilkSayi Tek sayi ise
        toplam = toplam+ikinciSayi;//ikinci sayiyi toplam variable'ina toplayarak ata
        }
        ilkSayi = ilkSayi/2;
        ikinciSayi = ikinciSayi * 2;

        }while(ilkSayi>=1);//ilkSayi 1 oluncaya kadar calis

        if(negatif)
        toplam =- toplam;
        return toplam;
        }
}