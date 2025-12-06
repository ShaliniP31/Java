package methods;

public class Overloading {


    void test() {
        System.out.println("Test with no parameters");
    }

    void test(int n) {
        System.out.println("Test with 1 integer parameter: " + n);
    }

    void test(double n) {
        System.out.println("Test with 1 double parameter: " + n);
    }
}
