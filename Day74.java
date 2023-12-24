package day;

import java.util.Scanner;

public class Day74 {

    public static void main(String[] args) {
        while (true) {
            Scanner dn = new Scanner(System.in);
            double diskon = 0;
            double afterDiskon = 0;
            System.out.println("masukkan total pesanan anda: ");
            int total = dn.nextInt();
            if (total < 50000) {
                System.out.println("total pesanan anda: " + total);

            } else if (total >= 50000) {
                diskon = 0.05 * total;
                afterDiskon = total - diskon;

                System.out.println("selamat anda mendapatkan diskon 5%");
                System.out.println("total belanja: " + total);
                System.out.println("total belanja anda setelah diskon: " + afterDiskon);

            }
        }
    }

}
