
class Rectangle {

    private double width = 1;
    private double length = 1;

    // Default Constructor
    public Rectangle() {
    }

    // Parameterized Constructor
    public Rectangle(double w, double l) {
        width = w;
        length = l;
    }

    // Get Area
    public double getArea() {
        return width * length;
    }

    // Get Perimeter
    public double getPerimeter() {
        return 2 * (width + length);
    }
}

public class Main {

    public static void main(String[] args) {

        // First Rectangle (Default)
        Rectangle r1 = new Rectangle();

        // Second Rectangle
        // Width = 10, Length = 5
        Rectangle r2 = new Rectangle(10, 5);

        System.out.println("First Rectangle:");
        System.out.println("Area: " + r1.getArea());
        System.out.println("Perimeter: " + r1.getPerimeter());

        System.out.println();

        System.out.println("Second Rectangle:");
        System.out.println("Area: " + r2.getArea());
        System.out.println("Perimeter: " + r2.getPerimeter());
    }
}
