package inheritance_abstract_eg;

public class Main {
    public static void main(String[] args) {
//        Shape s = new Shape();

        Shape s = new Rectangle(10, 20);
        System.out.println("Rectangle");
        System.out.println(s.area());
        System.out.println(s.perimeter());

        s = new Circle(12);
        System.out.println("Circle");
        System.out.println(s.area());
        System.out.println(s.perimeter());

        s = new Square(5);
        System.out.println("Square");
        System.out.println(s.area());
        System.out.println(s.perimeter());

        s = new Triangle(4, 6);
        System.out.println("Triangle");
        System.out.println(s.area());
        System.out.println(s.perimeter());
    }
}
