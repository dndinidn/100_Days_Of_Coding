package Day;

import java.util.Scanner;

public class Day87 {

    public static void main(String[] args) {
        Scanner dn = new Scanner(System.in);
        System.out.print("masukkan angka: ");
        int angka = dn.nextInt();
        String number = String.valueOf(angka);
        System.out.println("sebelum di konversi " + angka + " + 2 = " + (angka + 2));
        System.out.println("setelah di konversi " + number + " + 2 = " + (number + 2));

    }
}
