package inheritance_interface_eg;

public class Triangle implements Shape {
    int base;
    int height;

    Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return 0.5 * (base * height);
    }

    @Override
    public double perimeter() {
        return 3 * base;
    }
}
