package miscellaneous.sealed;

public sealed class A extends SealedClass permits C{
    void show() {
        System.out.println("In A");
    }
}
