package tematyka9.excercises.Task9_9;

import java.util.ArrayList;

/**
 * Created by BIURO22 on 2023-02-08
 */
public class Test {
    public static void main(String[] args) {

        Vehicle moto1 = new Motorcycle(2, 135, 75, 2, 20);
        Vehicle moto2 = new Motorcycle(3, 80,35, 1, 15);
        Vehicle moto3 = new Motorcycle(3, 68, 34, 3, 19);

        Vehicle car1 = new Car(4,190, 120, 5, false);
        Vehicle car2 = new Car(4, 280, 400, 2, true);
        Vehicle car3 = new Car(3, 120, 70, 3, false);

        Vehicle tram1 = new Tram(8, 65, 120, 80, 2);
        Vehicle tram2 = new Tram(16, 90, 200, 160, 3);
        Vehicle tram3 = new Tram(24, 75, 140, 200, 4);


        ArrayList<Vehicle> vehiclesList = new ArrayList<>();

        vehiclesList.add(moto1);
        vehiclesList.add(moto2);
        vehiclesList.add(moto3);
        vehiclesList.add(car1);
        vehiclesList.add(car2);
        vehiclesList.add(car3);
        vehiclesList.add(tram1);
        vehiclesList.add(tram2);
        vehiclesList.add(tram3);

        for(Vehicle vehicle : vehiclesList) {
            System.out.print(vehicle.toString() + " ");
            vehicle.boostUpEngine(0.47);
        }

    }
}
