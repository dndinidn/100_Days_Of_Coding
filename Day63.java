package day;

import java.util.Scanner;

public class Day63 {

    public static void main(String[] args) {
        Scanner dn = new Scanner(System.in);
        int temp = 0;
        while (true) {

            System.out.print("masukkan angka= ");
            int angka = dn.nextInt();
            temp += angka;
            System.out.println("hasil= " + temp);
        }
    }
}
