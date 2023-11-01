package day;

import java.util.Scanner;

public class Day24 {

    public static void main(String[] args) {
        Scanner dn = new Scanner(System.in);
        System.out.print("masukkan angka= ");
        int angka = dn.nextInt();
        for (int i = 1; i <= angka; i++) {
            if (i % 4 == 0) {
                System.out.println(i + 1);

            }
        }

    }

}
