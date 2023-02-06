package tematyka8.excercises.Task8_4;

/**
 * Created by BIURO22 on 2023-02-06
 */
public class Vehicle {

    int maxSpeed;
    int lineNumber;
    Depot depot;

    public Vehicle(int maxSpeed, int lineNumber, Depot depot) {
        this.maxSpeed = maxSpeed;
        this.lineNumber = lineNumber;
        this.depot = depot;
    }

    public void showInfo() {
        System.out.println("max speed = " + maxSpeed + ", line number = " + lineNumber + ", depot name = " + depot.name);
    }
}
