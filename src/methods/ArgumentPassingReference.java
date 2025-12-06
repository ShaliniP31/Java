package methods;

public class ArgumentPassingReference {
    public static void main(String[] args) {
        Box box = new Box(10, 20, 30);
        box.display();

        box.calculate(box);
        box.display();
    }
}
