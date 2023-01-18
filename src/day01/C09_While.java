package day01;

import java.util.Scanner;

public class C09_While {
    //  Kullanicidan toplamak uzere sayi alin
    //  girilen sayilarin toplami 500 olur veya gecerse
    //  " Bu kadar sayi yeter" deyip toplami yazdirin
    //  bu soruyu illa da for loop ile yapalim dersek
    //  adim sayisini tahmin edip biraz abartabiliriz

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
      int sayilarinToplami =0;
        int girilenSayi=0;

        while (sayilarinToplami<500){
            System.out.println("TOPLAMAK ICIN BIR SAYI GIRINIZ");
            girilenSayi=scan.nextInt();
            sayilarinToplami+=girilenSayi;

        }if (sayilarinToplami>=500){
            System.out.println("Bu kadar sayi yeter");

        }
    }


}
