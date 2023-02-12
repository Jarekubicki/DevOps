package tematyka8.excercises.Task8_4;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by BIURO22 on 2023-02-06
 */
public class Depot {

    protected ArrayList<Vehicle> vehicleInDepot;
    protected String name;

    public Depot(String name, ArrayList<Vehicle> vehicleInDepot) {
        this.vehicleInDepot = vehicleInDepot;
        this.name = name;
    }


    public void showInfo() {
        System.out.println("Depot name = " + name
                + "; vehicles assigned to depot: " + Arrays.toString(vehicleInDepot.toArray()));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Vehicle> getVehicleInDepot() {
        return vehicleInDepot;
    }

    public void setVehicleInDepot(ArrayList<Vehicle> vehicleInDepot) {
        this.vehicleInDepot = vehicleInDepot;
    }
}
