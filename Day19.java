
package day.pkg19;

import java.util.Scanner;

public class Day19 {

    public static void main(String[] args) {
    Scanner dn = new Scanner (System.in);
    while (true){
        System.out.println("masukkan angka= ");
        int angka = dn.nextInt();
        if (angka%3==0 && angka%8==0) {
            System.out.println("tri okta");
            
        }else if (angka%6==0 && angka%8==0) {
            System.out.println("heksa okta");
            
        }else if (angka%5==0) {
            System.out.println("penta");
            
        }else{
            System.out.println("no rules");
            break;
     
    
        }
    }
    
}
    
}

