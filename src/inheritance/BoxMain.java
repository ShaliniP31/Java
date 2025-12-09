package inheritance;

public class BoxMain {
    public static void main(String[] args) {
        Box box = new BoxWeight(10, 10, 10, 10);
        System.out.println(box.calculateVolume());


    }
}
