package tematyka5.excercies.Task5_8;

/**
 * Created by BIURO22 on 2023-01-19
 */
public class ThreeDigitsInNumberTest {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 100, 50, 2000};
        int[][] numbers2D = {{100, 20}, {500, 1000}, {300, 200}, {1000, 50000}};


        int numberOfThreeDigitNumber = checkOneDimensionArray(numbers);
        System.out.println("Number of 3 digit numbers = " + numberOfThreeDigitNumber);


        int numberOfThreeDigitNumber2 = checkTwoDimensionTable(numbers2D);
        System.out.println("Number of 3 digit numbers = " + numberOfThreeDigitNumber2);


    }

    static int checkOneDimensionArray(int[] intsArray) {

        int counter = 0;
        for (int ints : intsArray) {
            if (ints >= 100 && ints < 1000) {
                counter++;
            }
            if (ints > -1000 && ints <= -100) {
                counter++;
            }
        }
        return counter;
    }

    static int checkTwoDimensionTable(int[][] intsArray) {
        int counter = 0;
        for(int i = 0; i < intsArray.length; i++) {
            for(int j = 0; j < intsArray[i].length; j++) {
                if (intsArray[i][j] >= 100 && intsArray[i][j] < 1000) {
                    counter++;
                }
                if (intsArray[i][j] > -1000 && intsArray[i][j] <= -100) {
                    counter++;
                }
            }
        } return counter;
    }


}
