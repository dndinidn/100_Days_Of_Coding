package Day;

import java.util.Scanner;

public class Day58 {

    public static void main(String[] args) {

        Scanner dn = new Scanner(System.in);
        System.out.println("\t rumus luas bangun datar");
        System.out.println("1. persegi");
        System.out.println("2. persegi panjang");
        System.out.println("3. segitiga");
        System.out.print("rumus apa yang anda cari= ");
        String rumus = dn.nextLine();
        if (rumus.equalsIgnoreCase("persegi")) {
            System.out.print("masukkan ukuran sisi= ");
            int sisi = dn.nextInt();
            int luas = sisi * sisi;
            System.out.println("luas persegi= " + luas);

        } else if (rumus.equalsIgnoreCase("persegi panjang")) {
            System.out.print("masukkan panjang= ");
            int panjang = dn.nextInt();
            System.out.print("masukkan lebar= ");
            int lebar = dn.nextInt();
            int luas = panjang * lebar;
            System.out.println("luas persegi panjang= " + luas);

        } else if (rumus.equalsIgnoreCase("segitiga")) {
            System.out.print("masukkan nilai alas= ");
            int alas = dn.nextInt();
            System.out.print("masukkan nilai tinggi= ");
            int tinggi = dn.nextInt();
            double luas = 0.5 * alas * tinggi;
            System.out.println("luas segitiga= " + luas);
        }

    }
}
