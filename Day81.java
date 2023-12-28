package Day;

import java.util.Scanner;

public class Day81 {

    public static void main(String[] args) {
        Scanner dn = new Scanner(System.in);
        System.out.print("masukkan angka: ");
        int batas = dn.nextInt();
        for (int i = batas; i > 0; i--) {
            if (i % 2 == 0) {
                i /= 2;
                System.out.println(i);

            }
        }
    }
}
