package tematyka8.excercises.Task8_2;

/**
 * Created by BIURO22 on 2023-02-06
 */
public class Square extends Shape {

    private int length;

    public Square(int length) {
        this.length = length;
    }

    public int calculateShapeArea(int side) {
        return side * side;
    }
}
