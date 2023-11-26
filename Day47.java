package Day;

import java.util.Scanner;

public class Day47 {

    public static void main(String[] args) {
        while (true) {
            Scanner dn = new Scanner(System.in);
            System.out.print("masukkan nilai a= ");
            int a = dn.nextInt();
            System.out.print("masukkan nilai b= ");
            int b = dn.nextInt();
            if (a > b) {
                System.out.println(a + " lebih besar dari " + b);

            } else if (a < b) {
                System.out.println(a + " lebih kecil dari " + b);

            } else {
                System.out.println(a + " dan " + b + " nilainya sama");
                break;
            }
            System.out.println("");
        }
    }
}
