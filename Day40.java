package day;

import java.util.Scanner;

public class Day40 {

    public static void main(String[] args) {
        Scanner dn = new Scanner(System.in);
        int ganjil = 0;
        int genap = 0;
        int angkagenap = 0;
         int angkaganjil = 0;
        System.out.print("masukkan batas awal= ");
        int batasAwal = dn.nextInt();
        System.out.print("masukkan batas akhir= ");
        int batasAkhir = dn.nextInt();
        for (int i = batasAwal; i <= batasAkhir; i++) {
            if (i % 2 == 0) {
                angkagenap = i;
                System.out.println(angkagenap);
                genap += 1;
            }
        }
 
        System.out.println("jumlah angka genap= "+genap);
        System.out.println();
        for (int i = batasAwal; i <= batasAkhir; i++) {
            if (i % 2 == 1) {
                angkaganjil = i;
                System.out.println(angkaganjil+" ");
                ganjil += 1;
            }
        }

        System.out.println("jumlah angka ganjil= "+ganjil);
    }

}
