
package day;

import java.util.Scanner;

public class Day23 {
    public static void main(String[] args) {
     Scanner dn = new Scanner(System.in);
        System.out.print("masukkan angka= ");
        int angka = dn.nextInt();
        if (angka%2==1) {
            System.out.println("hasil= "+(angka+2));
            
        }else if (angka%2==0) {
            System.out.println("hasil= "+(angka+1));
            
        }else{
            System.out.println("no rules");
        }
    }
   
       
    
}
