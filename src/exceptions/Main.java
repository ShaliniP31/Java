package exceptions;

public class Main {
    public static void main(String[] args) {
        try {
            demoproc();
        }catch (CustomException e){
            System.out.println(e);
        }
    }

    public static void demoproc() throws CustomException {
        throw new CustomException("demo");
    }
}
