package interfaces;

public class Main {
    public static void main(String[] args) {
        ClientA a = new ClientA();
        ClientB b = new ClientB();

        Callback cb = a;
        cb.callback(10);
//        cb.show();

        cb = b;
        cb.callback(10);


        A.NestedIf a1 = new B();
        System.out.println(a1.checkNegative(10));

        Z z = new Z();
        z.print();
        z.show("World");
    }
}
