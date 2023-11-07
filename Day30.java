package day;

import java.util.Scanner;

public class Day30 {

    public static void main(String[] args) {

        Scanner dn = new Scanner(System.in);
        System.out.println("1. deret kuadrat");
        System.out.println("2. deret kubik");
        System.out.print("silahkan pilih deret mana yang inign anda ketahui= ");
        int opsi = dn.nextInt();
        if (opsi == 1) {
            System.out.println("\tderet kuadrat");
        } else if (opsi == 2) {
            System.out.println("\tderet kubik");
        } else {

            System.out.println("tidak ada didalam opsi");
        }
        if (opsi == 1) {
            System.out.print("masukkan jumlah deret yang diinginkan= ");
            int deret = dn.nextInt();
            System.out.println("");
            for (int i = 1; i <= deret; i++) {
                System.out.print(i * i + " ");
            }
        } else if (opsi == 2) {
            System.out.print("masukkan jumlah deret yang diinginkan= ");
            int deret = dn.nextInt();
            for (int i = 1; i <= deret; i++) {

                System.out.print(i * i * i + " ");

            }
        } else {
            System.out.println();

        }

    }
}
