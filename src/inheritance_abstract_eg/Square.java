package inheritance_abstract_eg;

public class Square extends Shape {
    int side;

    Square(int side) {
        this.side = side;
    }

    @Override
    double area() {
        return side * side;
    }

    @Override
    double perimeter() {
        return 4 * side;
    }
}
