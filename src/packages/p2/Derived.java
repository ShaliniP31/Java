package packages.p2;

import packages.p1.Protection;

public class Derived extends Protection {
    Derived() {
        System.out.println("In p2.Derived constructor");
//        System.out.println(n);
//        System.out.println(nPri);
        System.out.println(nPro);
        System.out.println(nPub);
    }
}
