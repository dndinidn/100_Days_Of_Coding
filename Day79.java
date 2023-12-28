package Day;

import java.util.Scanner;

public class Day79 {

    public static void main(String[] args) {
        Scanner dn = new Scanner(System.in);
        System.out.print("masukkan angka: ");
        int angka = dn.nextInt();
        if (angka % 2 == 0) {
            angka *= 2;
            angka -= 2;
            System.out.println(angka);
        } else {
            System.out.println(angka);
        }

    }
}
