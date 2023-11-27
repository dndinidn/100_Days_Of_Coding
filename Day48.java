package day;

import java.util.Scanner;

public class Day48 {

    public static void main(String[] args) {
        Scanner dn = new Scanner(System.in);
        System.out.println("masukkan angka= ");
        int angka = dn.nextInt();
        if (angka > 2) {
            for (int i = 1; i <= angka; i++) {
                if (i % 3 == 0) {
                    System.out.println(i);

                }

            }
        } else if (angka == 1) {
            System.out.println("kosong");

        } else if (angka == 2) {
            System.out.println("kosong");

        }

    }

}
