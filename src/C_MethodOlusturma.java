

public class C_MethodOlusturma {
    public static void main(String[] args) {

       /*
          Kullanicidan input olarak verilen bir String, baslangic ve bitis indexlerine gore
          baslangic index'i dahil,
          bitis index'i haric olacak sekilde aradaki harfleri yazdiran
          bir method olusturun.
          - kullanici baslangic degeri olarak, bitis degerinden buyuk bir sayi girerse,
          hata mesaji verin
          - kullanici str'da olan index'lerden daha buyuk bir index girerse
          hata mesaji yazdirin.
      */



        String input="Hayat her zaman güzel";


        System.out.println(input.substring(2,8));




    }


}


/*  // Verilen bir String'i terse cevirip
        // o halini bize donduren bir method olusturun

        System.out.println(metniTerseCevir("Java candir"));
    }
    public static String metniTerseCevir(String str){
        String tersStr="";
        for (int i = str.length()-1 ; i >=0 ; i--) {
            tersStr += str.charAt(i);
        }
        return tersStr;
    }*/