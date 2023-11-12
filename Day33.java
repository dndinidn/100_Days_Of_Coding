package day;

import java.util.Scanner;

public class Day33 {

    public static void main(String[] args) {
        int[] array = new int[4];
        Scanner dn = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.print("masukkan elemen ke- " + (i + 1) + " = ");
            array[i] = dn.nextInt();
        }
        for (int t : array) {
            System.out.print(t + " ");

        }
        System.out.println();
    }
}
