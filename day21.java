
import java.util.Scanner;

public class day21 {

    public static void main(String[] args) {
        Scanner dn = new Scanner(System.in);
        System.out.println("masukkan nilai anda= ");
        int nilai = dn.nextInt();
        if (nilai >= 70) {
            System.out.println("anda lolos");

        }
        if (nilai < 70) {
            System.out.println("error");

        }

    }

}

}
