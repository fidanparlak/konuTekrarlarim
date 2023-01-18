package day14_doWhileLoopScope;

import java.util.Scanner;

public class C02 {
            // Soru 3- Kullanicidan bir pozitif sayi isteyin,
            // sayının tam kare olup olmadığını bulunuz,
            // tamkare ise true değilse false yazdırınız.
            // Ornek :  input : 16, output: 4
            public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                int input = 36;
                int karekok = 1;
                boolean sonuc = false;

                do {
                    if (karekok*karekok==input){
                        System.out.println("Girilen sayinin karekoku : " + karekok);
                        sonuc=true;
                        break;
                    }else{
                        karekok++;
                    }
                }while(karekok*karekok<=input);
                System.out.println(sonuc);
            }
}