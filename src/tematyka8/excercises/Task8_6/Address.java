package tematyka8.excercises.Task8_6;

/**
 * Created by BIURO22 on 2023-02-07
 */
public class Address {

    String street;
    String city;
    String state;
    String postalCode;
    String country;

    public Address(String street, String city, String state, String postalCode, String country) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.country = country;
    }


    public boolean validate() {
        return true;
    }


    public void outputAsLabel() {
    }

}
