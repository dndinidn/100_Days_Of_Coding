package Day;

import java.util.Scanner;

public class Day78 {

    public static void main(String[] args) {
        Scanner dn = new Scanner(System.in);
        int poin = 0;
        System.out.print("apakah anda siap untuk memulai tes? yes/no : ");
        String awal = dn.nextLine();
        if (awal.equalsIgnoreCase("yes")) {
            System.out.print("apa lambang dari unsur Natrium? : ");
            String one = dn.nextLine();
            if (one.equalsIgnoreCase("Na")) {
                poin += 2;
                System.out.println("benar");
            } else {
                System.out.println("salah");
            }
            System.out.print("berapa nomor atom nomor atom dari Neon (Ne)? : ");
            int two = dn.nextInt();
            if (two == 10) {
                poin += 2;
                System.out.println("benar");

            } else {
                System.out.println("salah");
            }
            dn.nextLine();
            System.out.print("unsur kimia pada golongan VIIIA atau 8A disebut : ");
            String three = dn.nextLine();
            if (three.equalsIgnoreCase("gas mulia")) {
                poin += 2;
                System.out.println("benar");

            } else {
                System.out.println("salah");
            }
            System.out.print("nama unsur yang berada pada golongan IIIA periode 3 adalah : ");
            String four = dn.nextLine();

            if (four.equalsIgnoreCase("Aluminium")) {
                poin += 2;
                System.out.println("benar");

            } else {
                System.out.println("salah");

            }
            System.out.println("berapa jumlah neutron pada Manesium (Mg)? : ");
            int five = dn.nextInt();
            if (five == 12) {
                poin += 2;
                System.out.println("benar");

            } else {
                System.out.println("salah");
            }
            System.out.println("total poin anda= " + poin);

        } else {
            System.out.println("baik, terimakasih");
        }

    }
}
