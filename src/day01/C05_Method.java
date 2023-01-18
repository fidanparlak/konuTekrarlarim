package day01;

import java.util.Locale;

public class C05_Method {
    //- Kullanicidan main method icinde ayri ayri isim ve soyismini alin
    //Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde duzenleyip,
    //isim bosluk soyisim seklinde bize donduren bir method olusturun
    //input : isim : Ali soyisim :YILMAZ. output : Ali Yilmaz

    public static void main(String[] args) {

        String isim="Fidan";
        String soyIsim ="Parlak";

        isimSoyisim(isim,soyIsim);





    }

    private static void isimSoyisim(String isim,String soyIsim) {
        System.out.println("Isim : "+isim.toUpperCase().charAt(0)+isim.substring(1)+
                "\n"+ "Soy Isim : "+soyIsim.toUpperCase().charAt(0)+soyIsim.substring(1));
    }


}
