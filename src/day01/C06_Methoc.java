package day01;

public class C06_Methoc {
    // Kullanicidan main method icinde bir tamsayi alin.
    // Girilen sayinin pozitif tam bolenleri sayisini bulup
    // bize donduren bir method olusturun.

    public static void main(String[] args) {

        int sayi=65;



        pozitifBolenler(sayi);

    }

    public static void pozitifBolenler(int sayi) {


        for (int i = 0; i <=sayi ; i++) {
            if (i%2==0) {
                System.out.print(i+" ");

        }
        }

    }

}

