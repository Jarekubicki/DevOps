package tematyka8.excercises.Task8_4;

/**
 * Created by BIURO22 on 2023-02-06
 */
public class Tramway extends Vehicle{

    private final int MAX_CARS_IN_TRAM_SET = 3;
    int numberOfCarsInTramSet;


    public Tramway(int maxSpeed, int lineNumber, Depot depot, int numberOfCarsInTramSet) {
        super(maxSpeed, lineNumber, depot);
        this.numberOfCarsInTramSet = numberOfCarsInTramSet;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.print("; number of cars in tramway set = " + numberOfCarsInTramSet);
    }

    @Override
    public String toString() {
        return "Tramway{" +
                "number of cars in tramSet = " + numberOfCarsInTramSet +
                ", maxSpeed = " + maxSpeed +
                ", lineNumber = " + lineNumber +
                ", depot = " + depot.name +
                '}';
    }
}
