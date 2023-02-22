package tematyka8.excercises.Task8_4;

/**
 * Created by BIURO22 on 2023-02-06
 */
public class Bus extends Vehicle{

    private int fuelUsageInMonth;


    public Bus(int maxSpeed, int lineNumber, String busDepot, int fuelUsageInMonth) {
        super(maxSpeed, lineNumber, busDepot);
        this.fuelUsageInMonth = fuelUsageInMonth;
    }


    public int getFuelUsageInMonth() {
        return fuelUsageInMonth;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("; amount of fuel(liters) consumed in month = " + fuelUsageInMonth);
    }

    @Override
    public String toString() {
        return "Bus{" +
                "fuelUsageInMonth = " + fuelUsageInMonth +
                ", maxSpeed = " + maxSpeed +
                ", lineNumber = " + lineNumber +
                ", depot = " + depot +
                '}';
    }
}
