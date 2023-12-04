package Day;

import java.util.Scanner;

public class Day53 {

    public static void main(String[] args) {
        while (true) {
            Scanner dn = new Scanner(System.in);
            System.out.print("masukkan nama= ");
            String nama = dn.nextLine();
            if (nama.equals("dini")) {
                System.out.println("nama yang anda masukkan sesuai");
                break;
            } else {
                System.out.println("masukkan ulang nama anda");

            }
        }

    }
}
