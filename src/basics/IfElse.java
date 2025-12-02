package basics;

public class IfElse {
    public static void main(String[] args) {
        int month = 4;
        String season;

        if (month == 12 || month == 1 || month == 2) {
            season = "Winter";
        } else if (month == 3 || month == 4 || month == 5) {
            season = "Summer";
        } else {
            season = "Monsoon";
        }
        System.out.println("Entered month is in " + season + " season.");
    }
}
