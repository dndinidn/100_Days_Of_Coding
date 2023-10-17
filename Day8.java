
package day.pkg8;

public class Day8 {

    public static void main(String[] args) {
        System.out.println("konversi tipe data primitif ke String");
        System.out.println("1. integer ke String");
        int a = 20;
        String b= String.valueOf(a);
        int c=100;
        System.out.println("output jika ditambah 100 sebelum di konversi= "+(a+c));
        System.out.println("output jika ditambah 100 sesudah di konversi= "+(b+c));
        System.out.println(" ");
        System.out.println("2. double ke String");
        double a1 = 20.1;
        String b1 = String.valueOf(a);
        double c1 =100.3;
        System.out.println("output jika ditambah 100 sebelum di konversi= "+(a1+c1));
        System.out.println("output jika ditambah 100 sesudah di konversi= "+(b1+c1));
}
    }
    

