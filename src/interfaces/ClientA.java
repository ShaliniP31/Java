package interfaces;

public class ClientA implements Callback {
    int a = 10;

    @Override
    public void callback(int p) {
        System.out.println("callback is " + p);
    }

    void show() {
        System.out.println(a);
    }

}
