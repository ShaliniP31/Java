package inheritance;

public class B extends A {
    //use of super for class members
    int i;

    B() {
        System.out.println("In B's constructor - 1");
    }

    B(int i, int j) {
        System.out.println("In B's constructor - 2");
        super.i = i;
        this.i = j;
    }

    void square() {
        super.square();
        System.out.println("In A: " + i * i);
    }

    void cube() {
        System.out.println("In B: " + i * i * i);
    }
}
