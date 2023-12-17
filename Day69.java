package day;

import java.util.Scanner;

public class Day69 {

    public static void main(String[] args) {
        Scanner dn = new Scanner(System.in);
        System.out.print("Menentukan tahun kabisat");
        System.out.println("masukkan tahun= ");
        int tahun = dn.nextInt();
        if (tahun % 4 == 0 && tahun % 100 == 1 || tahun % 400 == 0) {
            System.out.println(tahun + " merupakan tahun kabisat");

        } else {
            System.out.println(tahun + " bukan merupakan tahun kabisat");

        }
    }

}
