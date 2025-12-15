package packages.p2;

import packages.p1.Protection;

public class NotDerived {
    NotDerived() {
        Protection p = new Protection();
        System.out.println("In p2.NotDerived constructor");
//        System.out.println(p.n);
//        System.out.println(p.nPri);
//        System.out.println(p.nPro);
        System.out.println(p.nPub);
    }
}
