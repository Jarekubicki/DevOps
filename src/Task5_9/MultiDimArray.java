package Task5_9;

import java.util.Arrays;

/**
 * Created by BIURO22 on 2023-01-19
 */
public class MultiDimArray {
    public static void main(String[] args) {

        int[][] numbersArray = new int[3][];

        int lineRange = 5;
        int value = 0;

        for (int i = 0; i < numbersArray.length; i++) {
            for (int j = 0; j < lineRange; j++) {
                numbersArray[i][j] = value + 10;
                lineRange++;
                value += 10;
            }
        }
    }
}
