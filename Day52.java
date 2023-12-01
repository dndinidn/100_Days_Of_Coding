package Day;

import java.util.Scanner;

public class Day52 {

    public static void main(String[] args) {
        Scanner dn = new Scanner(System.in);
        System.out.print("masukkan panjang dalam satuan kilometer= ");
        double km = dn.nextDouble();

        double cm = km * 100000;
        System.out.println(km + " km = " + cm);
    }

}
