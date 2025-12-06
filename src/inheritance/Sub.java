package inheritance;

public class Sub extends Super {
    int c;

    void printc() {
        System.out.println("In Sub");
        System.out.println(c);
    }

    void add(){
        System.out.println("In Sub");
        System.out.println(a + b + c);
    }
}
