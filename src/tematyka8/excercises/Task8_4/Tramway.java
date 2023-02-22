package tematyka8.excercises.Task8_4;

/**
 * Created by BIURO22 on 2023-02-06
 */
public class Tramway extends Vehicle{

    private int numberOfCarsInTramSet;


    public Tramway(int maxSpeed, int lineNumber, String depot, int numberOfCarsInTramSet) {
        super(maxSpeed, lineNumber, depot);
        this.numberOfCarsInTramSet = numberOfCarsInTramSet;
    }

    public int getNumberOfCarsInTramSet() {
        return numberOfCarsInTramSet;
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
                ", depot = " + depot +
                '}';
    }
}
