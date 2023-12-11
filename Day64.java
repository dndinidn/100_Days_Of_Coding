package day;

import java.util.Scanner;

public class Day64 {

    public static void main(String[] args) {
        Scanner dn = new Scanner(System.in);

        int[] arrayLength = new int[4];
        for (int i = 0; i < arrayLength.length; i++) {
            System.out.print("masukkan elemen array ke-" + (i + 1) + " = ");
            arrayLength[i] = dn.nextInt();

        }
        for (int array : arrayLength) {

            System.out.print(" " + array + " ");
        }

    }

}
