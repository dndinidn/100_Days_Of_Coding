package Day;

import java.util.Scanner;

public class Day66 {

    public static void main(String[] args) {
        Scanner dn = new Scanner(System.in);
        System.out.println("konversi jam ke detik");
        System.out.print("masukkan jumlah jam = ");
        int jam = dn.nextInt();
        int detik = jam * 3600;
        System.out.println(jam + " jam = " + detik + " detik");

    }

}
