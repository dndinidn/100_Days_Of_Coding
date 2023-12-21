package Day;

import java.util.Scanner;

public class Day73 {

    public static void main(String[] args) {
        Scanner dn = new Scanner(System.in);
        System.out.print("masukkan angka= ");
        int angka = dn.nextInt();
        int faktorial = 1;
        if (angka >= 0) {
            for (int i = 1; i <= angka; i++) {
                faktorial *= i;

            }
            System.out.println("hasil faktorial dari " + angka + "! = " + faktorial);

        } else {
            System.out.println("angka tidak boleh negatif");
        }
    }

}
