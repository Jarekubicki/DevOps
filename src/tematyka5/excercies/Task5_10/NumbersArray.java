package tematyka5.excercies.Task5_10;

import java.util.Arrays;

/**
 * Created by BIURO22 on 2023-01-19
 */

// założenie: liczba 0 nie jest liczbą naturalną;

public class NumbersArray {
    public static void main(String[] args) {

        int number = 1;
        int[][] numbers = new int[10][3];


        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == 0) {
                    numbers[i][j] = number;
                    number++;
                } else if (j == 1) {
                    numbers[i][j] = (int) Math.pow(numbers[i][j - 1], 2);
                } else if (j == 2) {
                    numbers[i][j] = (int) Math.pow(numbers[i][j - 2], 3);
                }
            }
        }


        for (int[] ints : numbers) {
            System.out.println(Arrays.toString(ints));
        }


    }
}
