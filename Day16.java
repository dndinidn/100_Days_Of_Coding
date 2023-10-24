package day.pkg16;

import java.util.ArrayList;

public class Day16 {

    public static void main(String[] args) {
        System.out.println("ArrayList");
        ArrayList alkali = new ArrayList();
        alkali.add("Litium");
        alkali.add("Natrium");
        alkali.add("Kalium");
        alkali.add("Rubidium");
        alkali.add("Cesium");
        alkali.add("Fransium");
        alkali.remove("Fransium");
        alkali.add("Fransium");
        System.out.println(alkali);
        System.out.println("unsur pada alkali sebanyak " + alkali.size() + " unsur");

       
       
    }

}
