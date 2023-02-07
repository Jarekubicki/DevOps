package tematyka8.excercises.Task8_8;

/**
 * Created by BIURO22 on 2023-02-07
 */
public class Info extends Message {

    String infoMessage = "Listen carefully. We have some information regarding ...";
    int counter;

    @Override
    public void execute() {
        counter++;
        System.out.println(infoMessage);
        System.out.println("Total times message INFO displayed = " + counter);
    }

}
