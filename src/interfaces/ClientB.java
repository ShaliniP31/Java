package interfaces;

public class ClientB implements Callback {
    @Override
    public void callback(int p) {
        System.out.println("callback is " + p * p);
    }
}
