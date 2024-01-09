package Day;

public class Day91 {

    public static void main(String[] args) {
        double[][] array = {{1.1, 1.2},
        {2.1, 2.2}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }

    }
}

