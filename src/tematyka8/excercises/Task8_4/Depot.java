package tematyka8.excercises.Task8_4;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by BIURO22 on 2023-02-06
 */
public class Depot {

    protected String name;

    protected List<Vehicle> vehicles;

    public Depot(String name) {
        this.name = name;
        this.vehicles = new ArrayList<>();
    }

    public void showInfo() {
        System.out.println("Depot name = " + name);
    }

    public void addVehicle(Vehicle vehicle) {
        this.vehicles.add(vehicle);
    }
}
