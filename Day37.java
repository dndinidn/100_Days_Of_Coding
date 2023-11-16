package day;

import java.util.Scanner;

public class Day37 {

    public static void main(String[] args) {
        Scanner dn = new Scanner(System.in);
        System.out.println("masukkan angka= ");
        String angka = dn.nextLine();

        int konversi = Integer.valueOf(angka);
        System.out.println(angka + 100);
        System.out.println(konversi + 100);
    }

}
