package inheritance_interface_eg;

public class Circle implements Shape {
    final double PI = 3.14;
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * PI * radius;
    }
}
