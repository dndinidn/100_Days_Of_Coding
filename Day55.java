package Day;

public class Day55 {

    public static void main(String[] args) {
        System.out.println("\tsoal");
        System.out.println("buatlah program untuk menyelesaikan rumus");
        System.out.println("Y = bx^2 + 0,5x - c, dimana nilai b = 25, x=15, c=20");
        System.out.println("jawab: ");
        System.out.println("diketahui: b = 25");
        System.out.println("           x = 15");
        System.out.println("           c = 20");
        int b = 25;
        int x = 15;
        int c = 20;
        System.out.println("ditanyakan: Y...?");
        System.out.println("penyelesaian:");
        double y = b * (x * x) + 0.5 * x - c;
        System.out.println("hasil dari Y = bx^2 + 0,5x - c= " + y);
    }

}
