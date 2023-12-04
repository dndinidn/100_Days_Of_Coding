package Day;

import java.util.Scanner;

public class Day57 {

    public static void main(String[] args) {
        Scanner dn = new Scanner(System.in);
        System.out.print("masukkan nilai a= ");
        int a = dn.nextInt();
        System.out.print("masukkan nilai b= ");
        int b = dn.nextInt();
        System.out.println("");
        System.out.println("sebelum penukaran");
        System.out.println("a= " + a);
        System.out.println("b= " + b);
        
       int  temp = a;
        a = b;
        b = temp;
        System.out.println("");
        System.out.println("setelah penukaran");
        System.out.println("a= " + a);
        System.out.println("b= " + b);

    }

}
