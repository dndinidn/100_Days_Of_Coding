package day.pkg15;

public class Day15 {

    public static void main(String[] args) {
        System.out.println("Operator logika");
        boolean x = true;
        boolean y = false;
        boolean result;
        result = x && y;
        //operator && (AND)
        System.out.println("hasil dari x && y = " + result);

        result = y && x;
        System.out.println("hasil dari y && x = " + result);

        result = x && x;
        System.out.println("hasil dari x && y = " + result);

        result = y && y;
        System.out.println("hasil dari y && y = " + result);

        //operator || (OR)
        result = x || y;
        System.out.println("hasil dari x || y = " + result);

        result = y || x;
        System.out.println("hasil dari y || x = " + result);

        result = x || x;
        System.out.println("hasil dari x || y = " + result);

        result = y || y;
        System.out.println("hasil dari y || y = " + result);

        //operator ! (NOT)
        result = !x;
        System.out.println("hasil dari !x = " + result);

        result = !y;
        System.out.println("hasil dari !y = " + result);

    }

}
