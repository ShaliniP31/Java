package inheritance;

public class A {
    //use of super for class members
    int i;

    A() {
        System.out.println("In A's constructor");
    }

    void square() {
        System.out.println("In A: " + i * i);
    }

    void cube() {
        System.out.println("In A: " + i * i * i);
    }
}
