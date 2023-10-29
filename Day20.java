package day.pkg20;

import java.util.Scanner;

public class Day20 {

    public static void main(String[] args) {

        while (true) {
            Scanner dn = new Scanner(System.in);
            System.out.print("masukkan angka= ");
            int angka = dn.nextInt();
            String[] iupac = {"mono", "di", "tri", "tetra", "penta", "heksa", "hepta", "okta", "nona", "deka"};
            if (angka <= 10 && angka > 0) {
                System.out.println(angka + " as " + iupac[angka -= 1]);

            } else if (angka == 0) {
                System.out.println("no rules");
                break;
            } else {
                System.out.println("no rules");
                break;
            }
        }
    }
}
