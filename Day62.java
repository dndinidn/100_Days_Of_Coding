package day;

import java.util.Scanner;

public class Day62 {

    public static void main(String[] args) {
        Scanner dn = new Scanner(System.in);
        System.out.println("masukkan batas atas= ");
        int batasAtas = dn.nextInt();
        int temp = 0;
        for (int i = 0; i <= batasAtas; i++) {
            if (i % 2 == 1) {
                temp += i;

            }

        }
        System.out.println("total penjumlahan angka ganjil jika batas atasnya " + batasAtas + "adalah = " + temp);
    }

}
