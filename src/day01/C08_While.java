package day01;

public class C08_While {
    //- While loop kullanarak 2 basamakli 7 ile bolunebilen pozitif tamsayilariyazdirin.


    public static void main(String[] args) {

        int sayi = 10;
        while (sayi < 100) {
            if (sayi % 7 == 0) {
                System.out.print(sayi + " ");
            }
             sayi++;
        }
    }
}
