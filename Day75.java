package Day;

import java.util.Scanner;

public class Day75 {

    public static void main(String[] args) {
        Scanner dn = new Scanner(System.in);
        System.out.print("masukkan nilai batas awal: ");
        int first = dn.nextInt();
        System.out.print("masuukkan nilai batas akhir: ");
        int last = dn.nextInt();
        for (int i = last; i >= first; i--) {
            if (i % 2 == 0) {
                System.out.println(i);

            }
        }
    }

}
