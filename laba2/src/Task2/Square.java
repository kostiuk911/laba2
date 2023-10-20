package Task2;

public class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public void calculateArea() {
        area = side * side;
    }

    @Override
    public void calculateVolume() {
        volume = 0;
    }
}