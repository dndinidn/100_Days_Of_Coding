package day;

import java.util.Scanner;

public class Day36 {

    public static void main(String[] args) {

        Scanner dn = new Scanner(System.in);
        System.out.println("masukkan angka= ");
        int angka = dn.nextInt();

        for (int i = 1; i <= angka; i++) {
            if (i % 2 == 0) {
                i *= 2;

                System.out.println(i);

            }

        }
    }

}
