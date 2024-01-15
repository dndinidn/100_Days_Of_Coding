package Day;

import java.util.Arrays;
import java.util.Collections;

public class Day98 {

    public static void main(String[] args) {
        Integer[] data = {6, 3, 4, 8, 9, 5, 1, 2, 0};
        System.out.println("before sorting: " + Arrays.toString(data));
        //secara ascending
        Arrays.sort(data);
        System.out.println("after sorting(secara ascending): " + Arrays.toString(data));
        //secara descending
        Arrays.sort(data, Collections.reverseOrder());
        System.out.println("after sorting(secara descending): " + Arrays.toString(data));

    }

}
