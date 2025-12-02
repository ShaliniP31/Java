package datatypes;

public class Light {
    /*
    Program that computes the number of miles that light will travel
    in a specified number of days.
    The program shows the use of long datatype over int datatype
     */
    public static void main(String[] args) {
        in_int();
        in_long();
    }

    public static void in_int() {
        int lightspeed;
        int days;
        int seconds;
        int distance;

        lightspeed = 186000;
        days = 1000;
        seconds = days * 24 * 60 * 60;

        distance = lightspeed * seconds;
        System.out.println("In " + days + " days light will travel about " + distance + " miles");
    }

    public static void in_long() {
        int lightspeed;
        long days;
        long seconds;
        long distance;

        lightspeed = 186000;
        days = 1000;
        seconds = days * 24 * 60 * 60;

        distance = lightspeed * seconds;
        System.out.println("In " + days + " days light will travel about " + distance + " miles");
    }
}
