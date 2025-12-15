package interfaces;

public class Z implements X,Y{
    @Override
    public void show(String msg) {
        System.out.println(msg);
    }

    public void print() {
        System.out.println("Hello from Z");
    }
}
