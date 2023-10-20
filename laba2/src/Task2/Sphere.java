package Task2;


public class Sphere extends Shape {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        area = 4 * Math.PI * radius * radius;
    }

    @Override
    public void calculateVolume() {
        volume = 4.0 / 3 * Math.PI * radius * radius * radius;
    }
}
