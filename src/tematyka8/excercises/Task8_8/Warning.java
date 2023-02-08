package tematyka8.excercises.Task8_8;

/**
 * Created by BIURO22 on 2023-02-07
 */
public class Warning {

    static String warningMessage = "Watch out! Warning here!";
    static int counter = 0;

    static void execute() {
        counter++;
        System.out.println("Total message WARNING displayed = " + counter);
    }
}
