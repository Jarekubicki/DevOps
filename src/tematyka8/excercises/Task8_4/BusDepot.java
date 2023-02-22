package tematyka8.excercises.Task8_4;

import java.util.ArrayList;

/**
 * Created by BIURO22 on 2023-02-06
 */
public class BusDepot extends Depot {

    private int totalGasUsage = 0;

    public BusDepot(String name) {
        super(name);
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("depot type = " + BusDepot.class);
        System.out.println("Depot name: " + this.name);
        System.out.println("Buses assigned to depot: " + this.vehicles);
        System.out.println("Total fuel used by buses in the depot (liters) = " + totalGasUsage);
    }

    @Override
    public void addVehicle(Vehicle vehicle) {
        Bus bus = (Bus) vehicle;
        vehicles.add(bus);
        totalGasUsage += bus.getFuelUsageInMonth();
    }
}
