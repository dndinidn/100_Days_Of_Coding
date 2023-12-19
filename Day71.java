package Day;

import java.util.Scanner;

public class Day71 {

    public static void main(String[] args) {
        Scanner dn = new Scanner(System.in);
        System.out.print("masukkan jumlah data= ");
        int panjangdata = dn.nextInt();
        int nilai = 0;
        int hasil = 0;
        for (int i = 0; i < panjangdata; i++) {
            System.out.print("masukkan nilai ke-" + (i + 1) + " = ");
            nilai = dn.nextInt();
            hasil += nilai;
        }
        System.out.println("total nilai= " + hasil);
    }

}
