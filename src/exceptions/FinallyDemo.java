package exceptions;

public class FinallyDemo {
    public static void main(String[] args) {

        try {
            demoproc();
        } catch (NullPointerException e) {
            System.out.println("In catch in main");
        }

        demoproc2();
    }

    public static void demoproc() {
        try {
            throw new NullPointerException("demo");
//            System.out.println("After exception");
        } catch (NullPointerException e) {
            System.out.println("In catch in demoproc");
            throw e;
        } finally {
            System.out.println("In finally");
        }
    }

    public static void demoproc2(){
        try{
            System.out.println("In demproc2 try");
            return;
//            System.out.println("After return");
        } finally {
            System.out.println("In finally demoproc2");
        }
    }
}
