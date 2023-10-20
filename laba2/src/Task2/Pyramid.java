package Task2;

public class Pyramid extends Shape {
    private double base;
    private double height;

    public Pyramid(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void calculateArea() {
        area = base * base * 4;
    }

    @Override
    public void calculateVolume() {
        volume = 1.0 / 3 * base * base * height;
    }
}