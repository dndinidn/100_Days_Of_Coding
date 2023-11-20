
package Day;

import java.util.Scanner;

public class Day42 {
    public static void main(String[] args) {
        Scanner dn = new Scanner (System.in);
        System.out.println("masukkan nilai awal= ");
        int nilaiAwal=dn.nextInt();
        System.out.println("masukkan batas akhir= ");
        int batasAkhir=dn.nextInt();
        for (int i = batasAkhir; i >= nilaiAwal; i--) {
            if (i%2==1) {
                System.out.println(i*2);
                
            }
            
        }
    }
    
}
//perulangan terbalik jika angkanya ganjil maka akan dikalikan dengan 2