package tematyka9.excercises.Task9_9;

/**
 * Created by BIURO22 on 2023-02-09
 */
public class Car extends Vehicle{

    private boolean cabriolet;

    protected Car(int wheelsNumber, int maxSpeed, int engineHorsePower, int numberOfSeats, boolean cabriolet) {
        super(wheelsNumber, maxSpeed, engineHorsePower, numberOfSeats);
        this.cabriolet = cabriolet;
    }


    @Override
    protected void boostUpEngine(double boostUpRate) {
        double powerExtensionRate = 2;
        if(engineHorsePower < 100 && boostUpRate < 0.4) {
            engineHorsePower += engineHorsePower * 0.2;
            maxSpeed += maxSpeed * 0.3;
        }
        else if (engineHorsePower > 100 && boostUpRate <= 0.4) {
            engineHorsePower += engineHorsePower * 0.3;
            maxSpeed += maxSpeed * 0.4;
        }
        else if (engineHorsePower > 100 && boostUpRate > 0.4){
            engineHorsePower += engineHorsePower + (boostUpRate * powerExtensionRate);
            maxSpeed += maxSpeed * boostUpRate;
        }
        else {
            engineHorsePower += engineHorsePower * 0.25;
            maxSpeed += maxSpeed * 0.29;
        }

        System.out.println("max speed after engine power boosting up to " + engineHorsePower + " is " + maxSpeed +
                "km/h");

    }

    @Override
    public String toString() {
        return "Car{" +
                "cabriolet=" + cabriolet +
                ", wheelsNumber=" + wheelsNumber +
                ", maxSpeed=" + maxSpeed +
                ", engineHorsePower=" + engineHorsePower +
                ", numberOfSeats=" + numberOfSeats +
                '}';
    }
}
