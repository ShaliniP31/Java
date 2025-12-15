package packages.p1;

public class Protection {

    public int nPub = 3;
    protected int nPro = 4;
    int n = 1;
    private final int nPri = 2;

    public Protection() {
        System.out.println("In p1.Protection constructor");
        System.out.println(n);
        System.out.println(nPri);
        System.out.println(nPro);
        System.out.println(nPub);
    }
}
