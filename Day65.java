package Day;

import java.util.Scanner;

public class Day65 {

    public static void main(String[] args) {
        Scanner dn = new Scanner(System.in);
        System.out.print("masukkan jumlah detik= ");
        int detik = dn.nextInt();
        int jam = detik / 3600;
        int sisa = detik % 3600;
        int menit = sisa / 60;
        System.out.println(detik + " detik = " + jam + " jam " + menit + " menit");
    }

}
