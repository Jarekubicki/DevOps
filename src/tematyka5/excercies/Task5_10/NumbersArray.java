package tematyka5.excercies.Task5_10;

import java.util.Arrays;

/**
 * Created by BIURO22 on 2023-01-19
 */

// założenie: liczba 0 nie jest liczbą naturalną;

public class NumbersArray {
    public static void main(String[] args) {

        int number = 1;
        int[][] numbers = new int[12][5];


        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = (int)Math.pow(i + 1, j + 1);
            }
        }
        System.out.println(Arrays.deepToString(numbers));

        for (int[] ints : numbers) {
            System.out.println(Arrays.toString(ints));
        }


    }
}
