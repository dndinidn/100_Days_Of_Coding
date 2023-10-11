
package day3;

import java.util.Scanner;

public class Day3 {
    public static void main(String[] args) {
        System.out.print("kalkulator sesat");
        Scanner dn = new Scanner (System.in);
        System.out.print("masukkan angka pertama= ");
        int angkaPertama = dn.nextInt();
        System.out.print("masukkan angka kedua= ");
        int angkaKedua = dn.nextInt();
        System.out.print(angkaPertama+"+"+angkaKedua+"= "+angkaPertama*angkaKedua);
       
        
    }
    
}
