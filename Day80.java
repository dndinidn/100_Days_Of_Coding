package Day;

import java.util.Scanner;

public class Day80 {

    public static void main(String[] args) {
        Scanner dn = new Scanner(System.in);
        System.out.print("masukkan angka: ");
        int angka = dn.nextInt();
        for (int i = angka; i >= 0; i--) {
            if (i % 2 == 1) {
                System.out.println(i);
            }

        }

    }
}
