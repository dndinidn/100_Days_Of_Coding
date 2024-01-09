package Day;

import java.util.Scanner;

public class Day92 {

    public static void main(String[] args) {

        Scanner dn = new Scanner(System.in);
        System.out.print("masukkan angka = ");
        int angka = dn.nextInt();
        int hasil = (angka == 2) ? (angka * angka * angka) : (angka / 2);
        System.out.println("hasil = " + hasil);

    }
}
