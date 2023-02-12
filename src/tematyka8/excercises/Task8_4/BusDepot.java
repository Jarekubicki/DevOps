package tematyka8.excercises.Task8_4;

import java.util.ArrayList;

/**
 * Created by BIURO22 on 2023-02-06
 */
public class BusDepot extends Depot {

    private int totalFuelUsage = 0;

    private ArrayList<Bus> busesAssignedToDepot;

    public BusDepot(String name, ArrayList<Vehicle> vehicleInDepot, int totalFuelUsage, ArrayList<Bus> busesAssignedToDepot) {
        super(name, vehicleInDepot);
        this.totalFuelUsage = totalFuelUsage;
        this.busesAssignedToDepot = busesAssignedToDepot;
    }


    @Override
    public void showInfo() {
        super.showInfo();
        String depotCategory = this.getClass().getSimpleName();
        System.out.println("depot type = " + BusDepot.class);
        System.out.println("Buses assigned to depot: ");
        for (Bus bus : busesAssignedToDepot) {
            System.out.println(bus.toString());
            totalFuelUsage = totalFuelUsage + bus.getFuelUsageInMonth();
        }
        System.out.println("Total fuel used by buses in the depot (liters) = " + totalFuelUsage);
    }
}
