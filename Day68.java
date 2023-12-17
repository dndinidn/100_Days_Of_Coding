package day;

import java.util.Scanner;

public class Day68 {

    public static void main(String[] args) {
        System.out.println("Konversi Rupiah ke Dollar");
        Scanner dn = new Scanner(System.in);
        System.out.print("masukkan nilai rupiah = ");
        int rupiah = dn.nextInt();
        double dollar = rupiah * 0.000064;
        System.out.println("Rp." + rupiah + " = " + dollar + " dollar");
    }

}
