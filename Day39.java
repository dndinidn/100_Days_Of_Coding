package day;

import java.util.Scanner;

public class Day39 {

    public static void main(String[] args) {
        int ganjil = 0;
        int genap = 0;
        Scanner dn = new Scanner(System.in);
        System.out.println("masukkan angka= ");
        int angka = dn.nextInt();
        for (int i = 1; i <= angka; i++) {
            if (i % 2 == 0) {
                genap += 1;
            } else if (i % 2 == 1) {
                ganjil += 1;
            }
        }

        System.out.println("jumlah angka genap= " + genap);
        System.out.println("jumlah angka ganjil= " + ganjil);

    }
}
