package Day;

import java.util.Scanner;

public class Day41 {

    public static void main(String[] args) {
        Scanner dn = new Scanner(System.in);
        System.out.print("masukkan angka pertama");
        int nilaiAwal = dn.nextInt();
        System.out.print("masukkan angka kedua");
        int batasAkhir = dn.nextInt();
        for (int i = batasAkhir; i >= nilaiAwal; i--) {
            if (i % 2 == 1) {
                System.out.println("ganjil= " + i);

            } else if (i % 2 == 0) {
                System.out.println("genap= " + i);

            }

        }
    }

}
