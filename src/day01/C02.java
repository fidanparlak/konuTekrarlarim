package day01;

public class C02 {

    // verilen bir sayinin asal olup olmadigini true / false olarak donduren
    // bir method olusturun
    // asalSayiMi method'u boolean bir sonuc dondurdugunden
    // bu method'u calistirdigimizda
    // ya direk yazdirmaliyiz
    // veya method call'un getirecegi sonucu atamak icin bir variable olusturabilirim

    public static void main(String[] args) {

        System.out.println(asalSayi(13));


    }

    public static boolean asalSayi(int input) {

        boolean asalSayi=true;

        for (int i = 2; i <= input-1 ; i++) {
            if(input%i==0)
                 asalSayi=false;
            break;
        }
        return asalSayi;
    }

}
