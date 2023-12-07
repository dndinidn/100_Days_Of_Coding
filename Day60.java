package Day;

import java.util.Scanner;

public class Day60 {

    public static void main(String[] args) {
        Scanner dn = new Scanner(System.in);
        System.out.println("\t mencari luas bangun datar (layang-layang)");
        System.out.print("masukkan panjang diagonal pertama= ");
        int d1 = dn.nextInt();
        System.out.print("masukkan panjang diagonal kedua= ");
        int d2 = dn.nextInt();
        double luas = 0.5 * d1 * d2;
        System.out.println("luas layang-layang = " + luas);

    }

}
