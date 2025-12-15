package inheritance_interface_eg;

public class Rectangle implements Shape {
    int base;
    int height;

    Rectangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return base * height;
    }

    @Override
    public double perimeter() {
        return 2 * (base + height);
    }
}
