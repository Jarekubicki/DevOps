package tematyka8.excercises.Task8_8;

/**
 * Created by BIURO22 on 2023-02-07
 */
public class MessagingSystem {
    public static void main(String[] args) {


        showWarning();
        showWarning();
        showInfo();
        showWarning();
        showInfo();


    }



    static void showWarning() {
        System.out.print(Warning.warningMessage + ". //");
        Warning.execute();
        System.out.println("-----------------");
    }

    static void showInfo() {
        System.out.print(Info.infoMessage + ". //");
        Info.execute();
        System.out.println("-----------------");

    }

}