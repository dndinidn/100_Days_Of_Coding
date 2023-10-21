package day.pkg11;

import java.util.Scanner;

public class Day11 {

    public static void main(String[] args) {
        System.out.println("Operator Perbandingan");
        Scanner dn = new Scanner(System.in);
        System.out.print("masukkan nilai a = ");
        int a = dn.nextInt();
        System.out.print("masukkan nilai b = ");
         int b = dn.nextInt();
        boolean hasil;

        hasil = a > b; //lebih besar
        System.out.println(a + ">" + b + " = " + hasil);

        hasil = a < b; //lebih kecil
        System.out.println(a + "<" + b + " = " + hasil);

        hasil = a >= b; //lebih besar sama dengan
        System.out.println(a + ">=" + b + " = " + hasil);

        hasil = a <= b; //lebih kecil sama dengan
        System.out.println(a + "<=" + b + " = " + hasil);

        hasil = a == b; //sama dengan
        System.out.println(a + "==" + b + " = " + hasil);
//tes
        hasil = a != b; //tidak sama dengan
        System.out.println(a + "!=" + b + " = " + hasil);
    }

}
