package interfaces;

public interface Y {
    void show(String msg);

    default void print() {
        System.out.println("Hello from Y");
    }
}
