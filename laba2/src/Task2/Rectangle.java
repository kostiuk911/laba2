package Task2;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void calculateArea() {
        area = length * width;
    }

    @Override
    public void calculateVolume() {
        volume = 0;
    }
}