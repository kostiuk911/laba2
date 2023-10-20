package Task2;


public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Triangle(3, 4),
                new Square(6),
                new Rectangle(5, 8),
                new Cube(2),
                new Pyramid(4, 6),
                new Circle(3),
                new Sphere(2)
        };

        for (Shape shape : shapes) {
            shape.calculateArea();
            shape.calculateVolume();
            System.out.println("Shape: " + shape.getClass().getSimpleName());
            System.out.println("Area: " + shape.getArea());
            System.out.println("Volume: " + shape.getVolume());
            System.out.println();
        }
    }
}
