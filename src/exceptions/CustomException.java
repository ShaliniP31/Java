package exceptions;

public class CustomException extends Exception{
    String msg;
    CustomException(String msg) {
        this.msg = msg;
    }
    @Override
    public String toString() {
        return "Custom Exception thrown by user: " + msg;
    }
}
