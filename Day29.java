package day;

import java.util.Scanner;

public class Day29 {

    public static void main(String[] args) {
        Scanner dn = new Scanner(System.in);
        System.out.println("Tentukan titik beku larutan 0,025 mol suatu senyawa dalam 250 gram air, jika Kf air = 1,86 derajat C/m!");
        System.out.println("");

        System.out.print("tekan 0 untuk melihat opsi= ");
        int opsi = dn.nextInt();
        if (opsi == 0) {
            System.out.println("1. lihat rumus");
            System.out.println("2. hasil");
            System.out.println("");

            while (true) {
                System.out.print("masukkan opsi berapa yang ingin anda lihat= ");
                int pilihOpsi = dn.nextInt();
                if (pilihOpsi == 1) {
                    System.out.println("delta Tf= kf*m");
                    System.out.println("delta Tf= TfLarutan - TfPelarut");
                    System.out.println("");
                    System.out.println("keterangan :");
                    System.out.println("delta Tf= penurunan titik beku (derajat C)");
                    System.out.println("kf= tetapan perubahan titik beku(deract C kg/mol");
                    System.out.println("m= molalitas larutan (mol/kg)");
                    break;
                } else if (pilihOpsi == 2) {
                    double n = 0.025;
                    double p = 0.25;
                    double m = n / p;
                    double kf = 1.86;
                    double tfLarutan = m * kf;
                    double pelarut = 0;
                    double tf = pelarut - tfLarutan;
                    System.out.println("titik beku= " + tf + "derajat celcius");
                    break;
                } else {
                    System.out.println("diluar opsi");

                }

            }
        } else {
            System.out.println("tidak bisa melihat opsi, keyword yang anda masukkan salah");

        }

    }
}
}
