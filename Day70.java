package day;

import java.util.Scanner;

public class Day70 {

    public static void main(String[] args) {
        Scanner dn = new Scanner(System.in);
        System.out.println("masukkan kata: ");
        String word = dn.nextLine();
        StringBuffer kata = new StringBuffer(word);
        System.out.println("sebelum dibalik: " + kata);
        System.out.println("setelah dibalik: " + kata.reverse());

    }

}
