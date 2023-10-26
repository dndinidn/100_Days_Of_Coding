
package day.pkg17;

import static java.time.temporal.TemporalAdjusters.next;
import java.util.Scanner;

public class Day17 {
// Operator Aritmatika
    public static void main(String[] args) {
        System.out.println("Deret Homolog Alkana");
        Scanner dn = new Scanner (System.in);
        System.out.print("masukkan nilai n (between 2 to 20)= ");
       int n = dn.nextInt();
            System.out.println("Rumus= CnH2n+2");
            System.out.println("Rumus molekulnya adalah= C"+n+"H"+(2*n+2));
            
        }
    }
    

