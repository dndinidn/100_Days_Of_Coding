package day;

import java.util.Scanner;

public class Day49 {

    public static void main(String[] args) {
        int temp = 0;
        Scanner dn = new Scanner(System.in);
        System.out.print("masukkan angka= ");
        int angka = dn.nextInt();
        for (int i = 1; i <= angka; i++) {
            temp += i;
            System.out.println(temp);

        }

    }

}
