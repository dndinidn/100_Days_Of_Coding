package Day;

import java.util.Scanner;

public class Dayy89 {

    public static void main(String[] args) {
        Scanner dn = new Scanner(System.in);
        System.out.print("masukkan batas akhir = ");
        int batasAkhir = dn.nextInt();
        int batasAwal = 1;
        do {
            if (batasAwal % 2 == 0) {
                System.out.println(batasAwal);
            }
            batasAwal++;
        } while (batasAwal <= batasAkhir);
    }
}
