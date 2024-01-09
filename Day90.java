package Day;

import java.util.Scanner;

public class Day90 {

    public static void main(String[] args) {
        while (true) {
            Scanner dn = new Scanner(System.in);
            System.out.print("masukkan nama : ");
            String nama = dn.nextLine();
            dn.nextLine();
            System.out.print("masukkan alamat : ");
            String alamat = dn.nextLine();
            System.out.print("masukkan no hp : ");
            int noHp = dn.nextInt();
            dn.nextLine();
            System.out.print("apakah data yang anda masukkan sudah benar? yes/no : ");
            String konfirmasi = dn.nextLine();
            if (konfirmasi.equalsIgnoreCase("yes")) {
                System.out.println("nama : " + nama);
                System.out.println("alamat : " + alamat);
                System.out.println("no hp : " + noHp);
                break;
            } else if (konfirmasi.equalsIgnoreCase("no")) {
                continue;
            }

        }
    }
}
