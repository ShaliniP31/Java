package inheritance;

public class C extends B {

    int i;

    C() {
        System.out.println("In C's constructor");
    }

    C(int i) {
        this.i = i;
    }

    void square() {
        super.square();
    }

    void cube() {
        System.out.println("In C: " + i * i * i);
    }
}
