package Day;

import java.util.Scanner;

public class Day43 {

    public static void main(String[] args) {
        while (true) {
            Scanner dn = new Scanner(System.in);
            System.out.print("masukkan nilai awal= ");
            int nilaiAwal = dn.nextInt();
            System.out.print("masukkan batas akhir= ");
            int batasAkhir = dn.nextInt();
            for (int i = batasAkhir; i >= nilaiAwal; i--) {
                if (i % 2 == 0) {
                    System.out.println(i);

                }

            }
            System.out.println("");
        }
    }
}
