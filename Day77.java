package Day;

import java.util.Scanner;

public class Day77 {

    public static void main(String[] args) {
        while (true) {
            Scanner dn = new Scanner(System.in);
            System.out.print("apa nama dari senyawa Cl207: ");
            String senyawa = dn.nextLine();
            if (senyawa.equalsIgnoreCase("dikloro pentaoksida")) {
                System.out.println("jawaban anda benar");

                break;
            } else {

                System.out.println("jawaban yang anda masukkan salah, silahkan coba lagi");
                continue;
            }

        }

    }
}
