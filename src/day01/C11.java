package day01;

import java.util.Random;
import java.util.Scanner;

public class C11 {
    public static void main(String[] args) {
        /*
                   random olarak 1 ile 100 arasinda bir sayi olusturun
                   kullanicidan bu sayiyi bilmesini isteyin

                   kullanici her deger girdiginde
                   tuttugumuz sayi ile karsilastirip tahminini buyult/kucult diyelim

                   kullanici tuttugumuz sayiyi bildiginde
                   tahmin sayisini ve

                   - 3 veya daha az tahminde bildiyse "Vaowww"
                   - 4-8 tahminde bildiyse "Aferin"
                   - daha fazla tahminde bildiyse "basarisiz"
                   yazdirin
                 */
        Random rnd=new Random();
        int sayac=0;
        int tahmin=0;
        int girilenSayi= rnd.nextInt(100);

        Scanner scan=new Scanner(System.in);

        while (girilenSayi!=tahmin){
            System.out.println("LUTFEN BIR TAHMIN GIRINIZ");
            tahmin=scan.nextInt();
            if (girilenSayi == tahmin) {
                System.out.println(sayac+" tahminde sayiyi buldunuz");
                if (sayac<=3){
                    System.out.println("WOAWW "+sayac+" tahminde sayiyi buldunuz");
                } else if (sayac<=8) {
                    System.out.println("AFERIN "+sayac+" tahminde sayiyi buldunuz");

                }else{
                    System.out.println("BASARISIZ");
                }
                break;

            } else if (girilenSayi<tahmin) {
                System.out.println("LUTFEN SAYINIZI KUCULTUN");
                sayac++;
            }else {
                 System.out.println("LUTFEN SAYINIZI BUYUTUN");
                 sayac++;


        }






    }

}
    }
    //
    //        Random rnd= new Random();
    //        int tutulanSayi= rnd.nextInt(100);
    //
    //        int sayac=1;
    //        int tahmin=0;
    //
    //        Scanner scan = new Scanner(System.in);
    //
    //        while(tutulanSayi != tahmin){
    //            System.out.println("Lutfen bir tahmin giriniz");
    //            tahmin= scan.nextInt();
    //            if (tutulanSayi==tahmin){ // sayiyi bulduysa
    //                System.out.println(sayac +" tahmin ile tuttugum sayiyi buldun");
    //                if (sayac<=3){
    //                    System.out.println("Vaowww");
    //                } else if (sayac<=8) {
    //                    System.out.println("Aferin");
    //                }else {
    //                    System.out.println("Basarisiz");
    //                }
    //                break;
    //            } else if (tahmin<tutulanSayi) {
    //                System.out.println("Sayiyi buyut");
    //                sayac++;
    //            }else {
    //                System.out.println("Sayiyi kucult");
    //                sayac++;
    //            }
    //        }

