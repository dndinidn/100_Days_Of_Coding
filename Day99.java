package Day;

import java.util.Random;

public class Day99 {

    public static void main(String[] args) {
        while (true) {
            Random angka = new Random();
            int acak = angka.nextInt(20);
            System.out.println(acak + " ");
            if (acak % 5 == 0) {
                break;

            }
        }

    }
}
