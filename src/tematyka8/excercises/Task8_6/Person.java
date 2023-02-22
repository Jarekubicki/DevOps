package tematyka8.excercises.Task8_6;

/**
 * Created by BIURO22 on 2023-02-06
 */
public class Person {

    protected String name;
    protected int phoneNumber;
    protected String email;
    protected Address address;

    public Person(String name, int phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public Person(String name, int phoneNumber, String email, Address address) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
    }

    public void purchaseParkingPass() {

    }

}
