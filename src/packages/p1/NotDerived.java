package packages.p1;

public class NotDerived {
    NotDerived() {
        Protection p = new Protection();
        System.out.println("In p1.NotDerived constructor");
        System.out.println(p.n);
//        System.out.println(p.nPri);
        System.out.println(p.nPro);
        System.out.println(p.nPub);
    }
}
