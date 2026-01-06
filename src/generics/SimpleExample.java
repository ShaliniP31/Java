package generics;

public class SimpleExample<T> {
    T ob;

    SimpleExample(T ob) {
        this.ob = ob;
    }

    T getOb() {
        return ob;
    }

    void showType() {
        System.out.println("Type of T is " + ob.getClass().getName());
    }
}
