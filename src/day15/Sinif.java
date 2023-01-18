package day15;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Sinif {
    //Her girdi satırı, tek boşluklarla ayrılmış bir veya birkaç sözcük içerir. Her giriş satırındaki ilk
    //ve son sözcükler dışındaki sözcüklerin sırasını tersine çevirip sözcükleri değiştirmeden
    //kodu yazınız.
    //Çıktınızın satırlarında sonunda veya başında boşluk olmamalıdır.
    //Örnek; Kemal Can Tan Han Kuzu, Kemal Han Tan Can Kuzu'ya dönüşecektir

    public static void main(String[] args) {

        LinkedList<String> isimler=new LinkedList<>();
        isimler.add("Kemal");
        isimler.add("Can");
        isimler.add("Tan");
        isimler.add("Han");
        isimler.add("Kuzu");

        System.out.print(isimler +"");//[Kemal, Can, Tan, Han, Kuzu]
         String ilkIsim="Can";
         String ikinciIsim="Han";

         String bosKova="";

        int ilkIsimIndex=isimler.indexOf(ilkIsim);
        int ikinciIsimIndex=isimler.indexOf(ikinciIsim);

        isimler.set(ikinciIsimIndex,ilkIsim);
        isimler.set(ilkIsimIndex,bosKova);
        System.out.println(isimler);






        }






    }


