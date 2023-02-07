package tematyka9.excercises.Task9_4;

/**
 * Created by BIURO22 on 2023-02-07
 */
public class CalculationSystem implements Calculator{

    public CalculationSystem() {
    }

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int subtract(int a, int b) {
        return a - b;
    }

    @Override
    public int multiply(int a, int b) {
        return a * b;
    }

    @Override
    public double divide(int a, int b) {
        return (double) a / b;
    }


    public void performCalculations(int a, int b) {
        double result;
        result = add(a, b);
        System.out.println("Adding result = " + result);
        result = subtract(a, b);
        System.out.println("Subtraction result = " + result);
        result = multiply(a, b);
        System.out.println("Multiplying result = " + result);
        result = divide(a, b);
        System.out.println("Dividing result = " + result);

    }

}
