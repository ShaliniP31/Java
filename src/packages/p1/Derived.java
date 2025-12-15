package packages.p1;

public class Derived extends Protection {
    Derived() {
        System.out.println("In p1.Derived constructor");
        System.out.println(n);
//        System.out.println(nPri);
        System.out.println(nPro);
        System.out.println(nPub);
    }
}
