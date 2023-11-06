package day;

import java.util.Scanner;

public class Day28 {

    public static void main(String[] args) {
        while (true) {
            Scanner dn = new Scanner(System.in);

            System.out.println("1. Reamur");
            System.out.println("2. Fahrenheit");
            System.out.println("3. Kelvin");
            System.out.print("silahkan pilih ingin konversi celcius kemana= ");
            int pilihan = dn.nextInt();
            if (pilihan != 1 && pilihan != 2 && pilihan != 3) {
                System.out.println("diluar ketentuan");
                System.out.println("");
            } else {

                System.out.print("masukkan nilai celcius= ");
                double celcius = dn.nextDouble();
                double reamur = 0.8 * celcius;
                double fahrenheit = 1.8 * celcius + 32;
                double kelvin = celcius + 273;
                if (pilihan == 1) {

                    System.out.println(celcius + " derajat celcius " + "= " + reamur + " derajat reamur");

                } else if (pilihan == 2) {

                    System.out.println(celcius + " derajat celcius " + "= " + fahrenheit + " derajat fahrenheit");

                } else if (pilihan == 3) {

                    System.out.println(celcius + " derajat celcius " + "= " + kelvin + " derajat kelvin");

                } else {
                    System.out.println("diluar ketentuan");

                }

                break;
            }
        }
    }
}
