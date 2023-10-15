package day.pkg7;

import java.util.Scanner;

public class Day7 {

    public static void main(String[] args) {
        Scanner dn = new Scanner(System.in);

        System.out.print("masukkan angka= ");
        int angka = dn.nextInt();
        for (int i = 0; i < angka; i++) {
            if (i % 2 == 0) {
                System.out.println(i);

            }

        }
        System.out.println("selesai menampilkan angka genap yang berada dibawah "+angka);
    }
}
