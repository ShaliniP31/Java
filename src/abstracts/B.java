package abstracts;

public class B extends A {
    @Override
    void callme() {
        System.out.println("In B: Hey");
    }

    void callme2() {
        System.out.println("In B: Hello");
    }
}
