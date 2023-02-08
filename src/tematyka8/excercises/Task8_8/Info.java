package tematyka8.excercises.Task8_8;

/**
 * Created by BIURO22 on 2023-02-07
 */
public class Info {

    static String infoMessage = "Listen carefully. We have some information regarding ...";
    static int counter = 0;

    static void execute() {
        counter++;
        System.out.println("Total message INFO displayed = " + infoMessage);
    }

}
