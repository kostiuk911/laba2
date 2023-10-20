package Task2;

public abstract class Shape {
    protected double area;
    protected double volume;

    public abstract void calculateArea();
    public abstract void calculateVolume();

    public double getArea() {
        return area;
    }

    public double getVolume() {
        return volume;
    }
}