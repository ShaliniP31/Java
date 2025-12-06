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
    }
}
