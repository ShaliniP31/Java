package interfaces;

public interface X {

    void show(String msg);

    default void print() {
        System.out.println("Hello from X");
    }
}
