package day;

import java.util.Scanner;

public class day26 {

    public static void main(String[] args) {

        System.out.println("skala prioritas biloks");
        System.out.println("1. Golongan 1A");
        System.out.println("2. Golongan 2A");
        System.out.println("3. Glongan 7A");

        while (true) {
            Scanner dn = new Scanner(System.in);
            System.out.print("masukkan nomor berapa pilihan anda= ");
            int angka = dn.nextInt();

            switch (angka) {
                case 1:
                    System.out.println("biloks dari golongan 1A= +1");
                    break;
                case 2:
                    System.out.println("biloks golongan 2A= +2");
                    break;
                case 3:
                    System.out.println("biloks golongan 7A= +7");
                    break;

                default:

                    System.out.println("tidak diketahui");
                    continue;
            }
            break;

        }
    }
}
