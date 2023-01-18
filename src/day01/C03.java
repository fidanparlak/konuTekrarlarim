package day01;

public class C03 {
    public static void main(String[] args) {
        // 2 basamakli sayilardan 7 ile bolunebilenleri yazdirin

        int sayi=10;
        while (sayi<100){
            if (sayi%7==0){
                System.out.print(sayi+" ");
            }
            sayi++;
        }
    }

}
