package Day;

import java.util.Scanner;

public class Day67 {

    public static void main(String[] args) {
        while (true) {
            Scanner dn = new Scanner(System.in);
            System.out.print("masukkan huruf= ");
            char huruf = dn.next().charAt(0);
            if (huruf == 'a' || huruf == 'i' || huruf == 'u' || huruf == 'e' || huruf == 'o') {
                System.out.println(huruf + " merupakan huruf vokal");
            } else {
                System.out.println(huruf + " merupakan huruf konsonan");
                break;
            }
        }
    }
}
