package Day;

import java.util.Scanner;

public class Day56 {

    public static void main(String[] args) {

        Scanner dn = new Scanner(System.in);
        System.out.println("1. Arus(I)");
        System.out.println("2. Tegangan (V)");
        System.out.println("3. Hambatan (R)");
        System.out.print("silahkan pilih ingin menghitung apa= ");
        String rumus = dn.nextLine();
        if (rumus.equalsIgnoreCase("arus")) {
            System.out.print("masukkan nilai tegangan= ");
            double v = dn.nextInt();
            System.out.print("masukkan nilai hambatan= ");
            double r = dn.nextInt();
            double i = v / r;
            System.out.println("arus= " + i);

        } else if (rumus.equalsIgnoreCase("tegangan")) {
            System.out.print("masukkan nilai arus= ");
            double i = dn.nextInt();
            System.out.print("masukkan nilai hambatan= ");
            double r = dn.nextInt();
            double v = i * r;
            System.out.println("tegangan= " + v);

        } else if (rumus.equalsIgnoreCase("hambatan")) {
            System.out.print("masukkan nilai tegangan= ");
            double v = dn.nextInt();
            System.out.print("masukkan nilai arus= ");
            double i = dn.nextInt();
            double r = v / i;
            System.out.println("hambatan= " + r);
        }
    }
}
