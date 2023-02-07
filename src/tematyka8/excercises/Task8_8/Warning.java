package tematyka8.excercises.Task8_8;

/**
 * Created by BIURO22 on 2023-02-07
 */
public class Warning extends Message{

    String warningMessage = "Watch out! Warning here!";
    int counter;


   public void execute() {
       counter++;
       System.out.println(warningMessage);
       System.out.println("Total times message WARNING displayed = " + counter);
   }


}
