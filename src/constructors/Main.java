package constructors;

public class Main {
    public static void main(String[] args) {
        Overloading overloading1 = new Overloading();
        overloading1.display();

        Overloading overloading2 = new Overloading(10);
        overloading2.display();

        Overloading overloading3 = new Overloading(30, 20);
        overloading3.display();

        Overloading overloading4 = new Overloading(overloading2);
        overloading4.display();
    }
}
