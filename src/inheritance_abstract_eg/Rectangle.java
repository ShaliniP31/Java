package inheritance_abstract_eg;

public class Rectangle extends Shape {
    int base;
    int height;

    Rectangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double area() {
        return base * height;
    }

    @Override
    double perimeter() {
        return 2 * (base + height);
    }
}
