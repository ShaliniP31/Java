package inheritance;

public class Main {
    public static void main(String[] args) {
        Super s1 = new Super();
        s1.a = 10;
        s1.b = 15;
        s1.printab();

        Sub s2 = new Sub();
        s2.a = 20;
        s2.b = 25;
        s2.c = 30;
        s2.printab();
        s2.printc();
        s2.add();

        //use of super for class members
        B b = new B(10, 20);
        b.square();

        //Multilevel Hierarchy
        C c = new C();
        c.square();

        //Method Overriding
        A a1 = new B(10, 20);
        a1.cube();
        System.out.println(a1.i);
    }
}
