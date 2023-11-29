package Day;

import java.util.Scanner;

public class Day51 {

    public static void main(String[] args) {
        Scanner dn = new Scanner(System.in);
        System.out.println("masukkan batas awal= ");
        int batasAwal = dn.nextInt();
        System.out.println("masukkan batas akhir= ");
        int batasakhir = dn.nextInt();

        if (batasakhir % 2 == 0) {
            for (int i = batasakhir; i >= batasAwal; i--) {
                if (i % 2 == 0) {
                    System.out.println(i);

                }

            }

        } else if (batasakhir % 2 == 1) {
            for (int i = batasakhir; i >= batasAwal; i--) {
                if (i % 2 == 1) {
                    System.out.println(i);

                }

            }

        }
    }

}
