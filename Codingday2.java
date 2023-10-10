
package codingday2;

import java.util.Scanner;

public class Codingday2 {

    public static void main(String[] args) {
        System.out.println("RUMUS MENCARI LUAS SEGITIGA");
        Scanner dn = new Scanner (System.in);
        System.out.print("masukkan panjang alas= ");
        double alas = dn.nextDouble();
        System.out.print("masukkan tinggi= ");
        double tinggi= dn.nextDouble();
        double luas = 0.5*alas*tinggi;
        System.out.print("Luas segitiga nya adalah= " + luas);
        dn.close();
    }
    
}
