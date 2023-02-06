package tematyka8.excercises.Task8_4;

import java.util.ArrayList;

/**
 * Created by BIURO22 on 2023-02-06
 */
public class BusDepot extends Depot{

    ArrayList<Bus> busesAssignedToDepot;
    public BusDepot(String name, ArrayList<Bus> busesAssignedToDepot) {
        super(name);
        this.busesAssignedToDepot = busesAssignedToDepot;
    }

    @Override
    public void showInfo() {
        int totalFuelUsage = 0;
        super.showInfo();
        String depotCategory = this.getClass().getSimpleName();
        System.out.println("depot type = " + BusDepot.class);
        System.out.println("Buses assigned to depot: ");
        for (Bus bus : busesAssignedToDepot) {
            System.out.println(bus.toString());
            totalFuelUsage = totalFuelUsage + bus.fuelUsageInMonth;
        }
        System.out.println("Total fuel used by buses in the depot (liters) = " + totalFuelUsage);
    }
}
