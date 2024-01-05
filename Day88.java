package Day;

import java.util.Scanner;

public class Day88 {

    public static void main(String[] args) {
        Scanner dn = new Scanner(System.in);
        System.out.print("masukkan angka: ");
        String value = dn.nextLine();
        float nilai = Float.valueOf(value);
        int angka = Math.round(nilai);
        System.out.println("tipe data String: " + value + " + 4 = " + (value + 4));
        System.out.println("tipe data float: " + nilai + " + 4 = " + (nilai + 4));
        System.out.println("tipe data integer: " + angka + " + 4 = " + (angka + 4));

    }
}
