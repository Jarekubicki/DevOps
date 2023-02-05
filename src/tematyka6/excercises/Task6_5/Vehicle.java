package tematyka6.excercises.Task6_5;

/**
 * Created by BIURO22 on 2023-02-01
 */
public class Vehicle {
    private int maxSpeed;
    private float mileage = 0;

    public float addMileage(float kilometers) {
        return mileage + kilometers;
    }



    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public float getMileage() {
        return mileage;
    }

    public void setMileage(float mileage) {
        this.mileage = mileage;
    }
}
