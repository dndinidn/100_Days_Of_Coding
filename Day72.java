package Day;

import java.util.Scanner;

public class Day72 {

    public static void main(String[] args) {
        Scanner dn = new Scanner(System.in);
        System.out.print("masukkan angka= ");
        int angka = dn.nextInt();
        if (angka % 3 == 0) {
            System.out.println(angka * 2);

        } else {
            System.out.println("angka ini tidak habis dibagi 3");
        }
    }

}
