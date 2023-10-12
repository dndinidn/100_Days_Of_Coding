
package codingday4;

import java.util.Scanner;

public class Codingday4 {

    public static void main(String[] args) {
        System.out.println("what's your generation?");
    Scanner dn = new Scanner (System.in);
        System.out.print("masukkan tahun lahir anda= ");
        int tahun = dn.nextInt();
        if (tahun <= 1945){
            System.out.println("anda termasuk generasi Boomer atau Silent Generation");
        } else if ((tahun >= 1946) && (tahun <= 1964)){
            System.out.println("anda termasuk generasi Baby Boomers");
        } else if ((tahun >= 1965) && (tahun <= 1976)){
            System.out.println("anda termasuk generasi  X ");
        } else if ((tahun >=1977) && (tahun<=1994)){
            System.out.println("anda termasuk generasi  Y ");
        }else if ((tahun >= 1995) && (tahun <= 2010)){
            System.out.println("anda termasuk generasi Z ");
        } else if ((tahun >= 2011) && (tahun <= 2025)){
            System.out.println("anda termasuk generasi Alpha");
        }else {
            System.out.println("belum diketahui");
        }
    }
    
}
