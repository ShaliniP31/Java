package inheritance_abstract_eg;

public class Triangle extends Shape {
    int base;
    int height;

    Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double area() {
        return 0.5 * (base * height);
    }

    @Override
    double perimeter() {
        return 3 * base;
    }
}
