package tematyka8.excercises.Task8_6;

/**
 * Created by BIURO22 on 2023-02-06
 */
public class Professor extends Person {

    private int salary;

    public Professor(String name, int phoneNumber, String email, int salary) {
        super(name, phoneNumber, email);
        this.salary = salary;
    }


    @Override
    public void purchaseParkingPass() {
        super.purchaseParkingPass();
    }
}
