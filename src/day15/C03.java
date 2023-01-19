package day15;

import java.util.Arrays;

public class C03 {
    //Soru 1- Verilen bir int array’in tum elemanlarini 2 artirip bize donduren bir method
    //olusturun. Eski array’i yeni haliyle kaydedin.

    public static void main(String[] args) {


    int [] arr={2,3,5,6,9,5,4,7};

   artirmaMethodu(arr);
        System.out.println(Arrays.toString(artirmaMethodu(arr)));
}

    private static int[] artirmaMethodu(int [] arr ) {

        int [] yeniArr=new int[arr.length];
        for (int i = 0; i <arr.length ; i++) {
           yeniArr[i]=arr[i]+2;


        }
        return yeniArr;


    }


}
