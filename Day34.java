package day;

import java.util.Scanner;

public class Day34 {

    public static void main(String[] args) {
        Scanner dn = new Scanner(System.in);
        System.out.print("masukkan nilai pertama= ");
        int pertama = dn.nextInt();
        System.out.print("masukkan nilai kedua= ");
        int kedua = dn.nextInt();
        int hasil = pertama + kedua;
        if (hasil % 2 == 0) {
            hasil += 2;
            System.out.println(hasil);

        } else if (hasil % 2 == 1) {
            hasil += 1;

            hasil *= hasil;

            System.out.println(hasil);

        }

    }
}
