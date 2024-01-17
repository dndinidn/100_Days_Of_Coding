package Day;

import java.util.Scanner;

public class Day100 {

    public static void main(String[] args) {
        while (true) {
            Scanner dn = new Scanner(System.in);
            System.out.println("masukkan angka1= ");
            int angka1 = dn.nextInt();
            System.out.println("masukkan angka2= ");
            int angka2 = dn.nextInt();
            int jumlah = angka1 + angka2;
            if (jumlah % 2 == 0) {

            } else {
                System.out.println(jumlah);
                break;
            }

        }
    }
}
