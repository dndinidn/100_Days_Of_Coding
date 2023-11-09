package day;

import java.util.Scanner;

public class Day31 {

    public static void main(String[] args) {
        Scanner dn = new Scanner(System.in);
        System.out.print("masukkan nilai= ");
        int nilai = dn.nextInt();
        for (int i = 1; i <= nilai; i++) {
            System.out.println();
            for (int j = 0 + i; j <= nilai; j++) {
                System.out.print(i);

            }

        }
        System.out.println();
    }
}
