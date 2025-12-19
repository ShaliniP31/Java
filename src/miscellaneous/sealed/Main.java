package miscellaneous.sealed;

public class Main {
    public static void main(String[] args) {
        SealedClass sc = new A();
        sc.show();

        sc = new B();
        sc.show();

        sc = new C();
        sc.show();

        sc = new D();
        sc.show();
    }
}
