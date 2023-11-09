package day;

import java.util.Scanner;

public class Day32 {

    public static void main(String[] args) {
        System.out.println("\tLIST MENU");
        System.out.println("1. fried rice--------------------15000");
        System.out.println("2. fried chicken-----------------12000");
        Scanner dn = new Scanner(System.in);
        while (true) {
            System.out.print("masukkan pilihan anda(1-2)= ");
            int pilihan = dn.nextInt();

            if (pilihan == 1) {
                System.out.print("masukkan jumlah pesanan anda= ");
                int jumlah = dn.nextInt();
                int harga_friedRice = jumlah * 15000;
                if (jumlah >= 3) {
                    int diskon = harga_friedRice * 5 / 100;
                    int total = harga_friedRice - diskon;
                    System.out.println("total harga pesanan sebelum diskon= " + harga_friedRice);
                    System.out.println("total harga pesanan anda setelah diskon= " + total);
                } else {
                    System.out.println("total harga pesanan anda= " + harga_friedRice);
                }
                break;
            } else if (pilihan == 2) {
                System.out.print("masukkan jumlah pesanan anda= ");
                int jumlah = dn.nextInt();
                int harga_friedChicken = jumlah * 12000;
                if (jumlah >= 3) {
                    int diskon = harga_friedChicken * 5 / 100;
                    int total = harga_friedChicken - diskon;
                    System.out.println("total harga pesanan sebelum diskon= " + harga_friedChicken);
                    System.out.println("total harga pesanan anda setelah diskon= " + total);

                } else {
                    System.out.println("total harga pesanan anda= " + harga_friedChicken);
                }
                break;
            } else {
                System.out.println("tidak ada di opsi");

            }

        }
    }

}
