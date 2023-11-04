package day;

import java.util.Scanner;

public class Day27 {

    public static void main(String[] args) {
        while (true) {
            Scanner dn = new Scanner(System.in);

            System.out.print("masukkan besar bintang: ");
            int besar = dn.nextInt();
            for (int i = 0; i <= besar; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print(" *");

                }
                System.out.println();

            }

        }

    }
}
