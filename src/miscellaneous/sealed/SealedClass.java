package miscellaneous.sealed;

public sealed class SealedClass permits A, B {
    void show() {
        System.out.println("In sealed class");
    }
}
