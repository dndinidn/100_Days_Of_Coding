package day;

import java.util.HashMap;

public class Day38 {

    public static void main(String[] args) {
        HashMap<Integer, String> tes = new HashMap<Integer, String>();
        tes.put(1, "dini");
        tes.put(2, "lili");
        tes.put(3, "ana");
        tes.put(3, "najwa");
        tes.put(3, "fahima");
        System.out.println("isi data= " + tes);
        System.out.println("nama= " + tes.get(2));
    }

}
