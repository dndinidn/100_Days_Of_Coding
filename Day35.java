package day;

import java.util.Scanner;

public class Day35 {

    public static void main(String[] args) {
        //angka genap yang habis dibagi 3
        Scanner dn = new Scanner(System.in);
        System.out.println("masukkan angka awal =");
        int a = 0;
        int b = 0;
        int batasAwal = dn.nextInt();
        System.out.println("masukkan angka akhir= ");
        int batasAkhir = dn.nextInt();
        for (int i = batasAwal; i <= batasAkhir; i++) {

            if (i % 3 == 0) {

                a = i;
                if (a % 2 == 0) {
                    b = a;
                    System.out.println(b);
                }

            }

        }

    }

}
