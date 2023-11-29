package Day;

import java.util.Scanner;

public class Day50 {

    public static void main(String[] args) {
        Scanner dn = new Scanner(System.in);
        System.out.println("masukkan batas akhir= ");
        int batasAkhir = dn.nextInt();
        System.out.println("masukkan angka(untuk kelipatannya)= ");
        int kelipatan = dn.nextInt();
        for (int i = 1; i <= batasAkhir; i++) {
            if (i % kelipatan == 0) {
                System.out.println(i);

            }

        }
    }

}
