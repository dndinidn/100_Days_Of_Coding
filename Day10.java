package day.pkg10;
import java.util.Scanner;
public class Day10 {
    public static void main(String[] args) {
        System.out.println("Operator Penugasan");
        Scanner dn = new Scanner(System.in);
        System.out.print("masukkan nilai a= ");
        int a = dn.nextInt();
        System.out.print("masukkan nilai b= ");
        int b = dn.nextInt();
        System.out.println("a+=b hasilnya yaitu= " + (a += b)); //penjumlahan
        System.out.println("a-=b hasilnya yaitu= " + (a -= b)); //pengurangan
        System.out.println("a/=b hasilnya yaitu= " + (a /= b)); //pembagian
        System.out.println("a*=b hasilnya yaitu= " + (a *= b)); //perkalian
        System.out.println("a%=b hasilnya yaitu= " + (a %= b)); //sisa bagi

    }
}
