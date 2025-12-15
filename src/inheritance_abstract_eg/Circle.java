package inheritance_abstract_eg;

public class Circle extends Shape {
    final double PI = 3.14;
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return PI * radius * radius;
    }

    @Override
    double perimeter() {
        return 2 * PI * radius;
    }
}
