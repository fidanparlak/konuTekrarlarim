package day01;

import java.util.Scanner;

public class C07While {
    public static void main(String[] args) {



         //  Soru : Kullanicidan Kullanicidan sifre isteyin asagidaki sartlari saglamayan
         //  sifrelerde hatalari yazdirip,
         //  kullanicinin yeni sifre girmesi isteyin
         //  Gecerli bir sifre yazilincaya kadar bu islemi tekrar edin
         //  gecerli sifre yazilinca “sifreniz basari ile kaydedildi” yazdirin
         //  sartlar :
         //  - sifrenin ilk karakteri kucuk harf olmali
         //  - sifrenin son karakteri sayi olmali

    Scanner scan=new Scanner(System.in);
    boolean sifreDogrumu= false;
    String sifre="";
    char ilkHarf;
    char sonHarf;

    while (!sifreDogrumu){
        System.out.println("LUTFEN SIFRENIZI GIRINIZ");
        sifre=scan.nextLine();
        ilkHarf =sifre.charAt(0);
        sonHarf=sifre.charAt(sifre.length()-1);
        if (ilkHarf<'a' || ilkHarf>'z'){
            System.out.println("ILK HARF KUCUK OLMALI");

        } else if (sonHarf <'0'|| sonHarf>'9') {
            System.out.println("SIFRENIN SON KARAKTERI RAKAM OLMALI");

        }else {
            System.out.println("SIFRE BASARI ILE KAYDEDILDI");
            sifreDogrumu=true;
        }


    }

}
 }