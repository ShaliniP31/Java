package classes;

public class Main {
    public static void main(String[] args) {
        Box box = new Box();
        box.width = 20;
        box.depth = 10;
        box.height = 15;

        double volume = box.height * box.width * box.depth;
        System.out.println("Volume is " + volume);

        Box box1 = box;
        System.out.println(box1.width);
        box.width = 30;
        System.out.println(box.width);
        System.out.println(box1.width);

        System.out.println("\n\nAdded methods");
        box.displayVolume();
        System.out.println("Volume is " + box.calculateVolume());

        System.out.println("\nParameterized Constructor");
        Box1 box2 = new Box1(10, 20, 15);
        System.out.println("Volume is " + box2.calculateVolume());

        PrivateAccess pa = new PrivateAccess();
        pa.j = 10;
        pa.printI();
        pa.printJ();

        pa.setI(7);
        pa.setJ(++pa.j);
        pa.printI();
        pa.printJ();

        Static.calculate();

        InnerClass ic  = new InnerClass();
        ic.print();
    }
}
