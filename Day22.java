
package day;

import java.util.Scanner;

public class Day22 {
    public static void main(String[] args) {
        Scanner dn = new Scanner(System.in);
        System.out.print("masukkan gaji anda= ");
        int gaji= dn.nextInt();
        System.out.print("lama lembur= ");
        int lembur= dn.nextInt();
        int gajiLembur=55000;
        int Totalgaji= gaji+(lembur*gajiLembur);
        System.out.println("total gaji= "+Totalgaji);
        
        
        
    }
    
}
