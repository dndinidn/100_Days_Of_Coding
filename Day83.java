package Day;

import java.util.Scanner;

public class Day83 {

    public static void main(String[] args) {
        Scanner dn = new Scanner(System.in);
        while (true) {
            System.out.print("unsur Rubidium (Rb) termasuk dalam blok? s/p/d/f : ");
            char blok = dn.next().charAt(0);
            if (blok == 's') {
                System.out.println("benar");
                break;
            } else {
                System.out.println("kurang tepat");
            }
        }

    }
}
