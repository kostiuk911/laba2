package Task2;

public class Cube extends Shape {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    public void calculateArea() {
        area = 6 * side * side;
    }

    @Override
    public void calculateVolume() {
        volume = side * side * side;
    }
}
