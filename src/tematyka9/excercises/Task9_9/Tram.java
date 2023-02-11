package tematyka9.excercises.Task9_9;

/**
 * Created by BIURO22 on 2023-02-09
 */
public class Tram extends Vehicle {

    private int numberOfCars;

    protected Tram(int wheelsNumber, int maxSpeed, int engineHorsePower, int numberOfSeats, int numberOfCars) {
        super(wheelsNumber, maxSpeed, engineHorsePower, numberOfSeats);
        this.numberOfCars = numberOfCars;
    }


    @Override
    protected void boostUpEngine(double boostUpRate) {
        engineHorsePower += engineHorsePower * boostUpRate;
        if (numberOfCars > 3) {
            maxSpeed += 0.2;
        } else if (numberOfCars < 2) {
            maxSpeed += 0.4;
        } else {
            maxSpeed += 0.3;
        }
        System.out.println("max speed after engine power boosting up to " + engineHorsePower +
                " is" +
                " " + maxSpeed +
                "km/h");
    }

    @Override
    public String toString() {
        return "Tram{" +
                "numberOfCars=" + numberOfCars +
                ", wheelsNumber=" + wheelsNumber +
                ", maxSpeed=" + maxSpeed +
                ", engineHorsePower=" + engineHorsePower +
                ", numberOfSeats=" + numberOfSeats +
                '}';
    }
}
