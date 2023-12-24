package Day;

import java.util.ArrayList;

public class Day76 {

    public static void main(String[] args) {

        ArrayList senyawa = new ArrayList();
        senyawa.add("SO2");
        senyawa.add("N205");
        senyawa.add("H2O");
        senyawa.add("Na2SO4");
        System.out.println(senyawa);
        System.out.println(senyawa.subList(1, 3));
        System.out.println(senyawa.subList(0, 3));

    }

}
