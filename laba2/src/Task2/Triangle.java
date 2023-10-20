package Task2;

public class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void calculateArea() {
        area = 0.5 * base * height;
    }

    @Override
    public void calculateVolume() {
        volume = 0;
    }
}