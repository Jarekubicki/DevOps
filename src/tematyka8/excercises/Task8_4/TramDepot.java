package tematyka8.excercises.Task8_4;

import java.util.ArrayList;

/**
 * Created by BIURO22 on 2023-02-06
 */
public class TramDepot extends Depot {

    private int totalCarts = 0;

    public TramDepot(String name) {
        super(name);
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("depot type = " + TramDepot.class);
        System.out.println("Depot name: " + this.name);
        System.out.println("Trams assigned to depot: " + this.vehicles);
        System.out.println("Total carts in depot = " + totalCarts);
    }

    @Override
    public void addVehicle(Vehicle vehicle) {
        Tramway tramway = (Tramway) vehicle;
        vehicles.add(tramway);
        totalCarts += tramway.getNumberOfCarsInTramSet();
    }

}
