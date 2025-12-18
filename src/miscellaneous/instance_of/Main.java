package miscellaneous.instance_of;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        System.out.println(a instanceof A);
        System.out.println(c instanceof A);
//        System.out.println(b instanceof A);

    }
}
