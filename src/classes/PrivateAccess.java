package classes;

public class PrivateAccess {
    private int i;
    public int j;

    public void setI(int a) {
        i = a;
    }

    public void setJ(int a) {
        j = a;
    }

    public void printI(){
        System.out.println(i);
    }

    public void printJ(){
        System.out.println(j);
    }
}
