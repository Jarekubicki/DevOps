package tematyka9.excercises.Task9_9;

/**
 * Created by BIURO22 on 2023-02-08
 */
public class Motorcycle extends Vehicle {

    private int fuelTankCapacity;


    public Motorcycle(int wheelsNumber, int maxSpeed, int engineHorsePower, int numberOfSeats, int fuelTankCapacity) {
        super(wheelsNumber, maxSpeed, engineHorsePower, numberOfSeats);
        this.fuelTankCapacity = fuelTankCapacity;
    }

    @Override
    protected void boostUpEngine(double boostUpRate) {
        engineHorsePower += engineHorsePower * boostUpRate;
        maxSpeed += maxSpeed * (boostUpRate + 0.1);
        System.out.println("max speed after engine power boosting up to " + engineHorsePower + " is " + maxSpeed +
                "km/h");
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "fuelTankCapacity=" + fuelTankCapacity +
                ", wheelsNumber=" + wheelsNumber +
                ", maxSpeed=" + maxSpeed +
                ", engineHorsePower=" + engineHorsePower +
                ", numberOfSeats=" + numberOfSeats +
                '}';
    }
}
