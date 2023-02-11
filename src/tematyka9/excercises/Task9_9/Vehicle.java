package tematyka9.excercises.Task9_9;

/**
 * Created by BIURO22 on 2023-02-08
 */
public abstract class Vehicle {

    int wheelsNumber;
    int maxSpeed;
    int engineHorsePower;
    int numberOfSeats;

    protected Vehicle(int wheelsNumber, int maxSpeed, int engineHorsePower, int numberOfSeats) {
        this.wheelsNumber = wheelsNumber;
        this.maxSpeed = maxSpeed;
        this.engineHorsePower = engineHorsePower;
        this.numberOfSeats = numberOfSeats;
    }

    protected abstract void boostUpEngine(double boostUpRate);

    @Override
    public String toString() {
        return "Vehicle{" +
                "wheelsNumber=" + wheelsNumber +
                ", maxSpeed=" + maxSpeed +
                ", engineHorsePower=" + engineHorsePower +
                ", numberOfSeats=" + numberOfSeats +
                '}';
    }
}
