package Day;

import java.util.Scanner;

public class Day44 {

    public static void main(String[] args) {

        Scanner dn = new Scanner(System.in);
        System.out.println("masukkan username= ");
        String username = dn.nextLine();
        System.out.println("masukkan password= ");
        String password = dn.nextLine();
        if (username.equals("dinidn") && password.equals("abc123")) {
            System.out.println("login anda berhasil");

        } else {
            System.out.println("login anda gagal");

        }
    }
}
