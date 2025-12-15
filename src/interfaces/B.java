package interfaces;

public class B implements A.NestedIf{
    @Override
    public boolean checkNegative(int a) {
        return a < 0;
    }
}
