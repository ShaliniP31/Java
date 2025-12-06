package classes;

public class Static {
    static int a = 3;
    static int b;

    static {
        System.out.println("In static block");
        b = 6;
    }

    static void calculate() {
        System.out.println(a * b);
    }
}
