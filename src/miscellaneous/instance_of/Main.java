package miscellaneous.instance_of;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        System.out.println(a instanceof A);
        System.out.println(c instanceof A);
//        System.out.println(b instanceof A);


        Number num = 100;

        if (num instanceof Integer i) {
            System.out.println(i);
        }
//        i;

        if (num instanceof Integer i && i > 50) {
            System.out.println(i);
        }

        //Not Possible
//        if( i > 50 && num instanceof Integer i){
//        }
    }
}
