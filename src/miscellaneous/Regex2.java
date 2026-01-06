package miscellaneous;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex2 {
    public static void main(String[] args) {
        String input = "67+Joy$% an,.2";

//        Find literal character full stop
//        Pattern pattern = Pattern.compile("\\.");

//        Find any character
//        Pattern pattern = Pattern.compile(".");

//        Find only digits
//        Pattern pattern = Pattern.compile("\\d");

//        Find character that is not a digit
//        Pattern pattern = Pattern.compile("\\D");

//        Find word character - matches A-Za-z0-9_
//        Pattern pattern = Pattern.compile("\\w");

//        Find not word characters
//        Pattern pattern = Pattern.compile("\\W");

//        Find whitespace character
//        Pattern pattern = Pattern.compile("\\s");

//        Check if character is beginning of string
//        Pattern pattern = Pattern.compile("^6");

//        Check if character is ending of string
//        Pattern pattern = Pattern.compile("2$");

//        Group 1 or more characters
//        input = "The quick brown fox jumps over the lazy dog.";
//        Pattern pattern = Pattern.compile("(\\w+)");

//        Group characters followed by numbers
//        input = "The quick brown fox jumps over 13 lazy dogs.";
//        Pattern pattern = Pattern.compile("(\\w+)\\s(\\d+)");

//        Extract only 3 digit numbers
//        input = "There are 123 apples, 456 oranges, and 78 bananas.";
//        Pattern pattern = Pattern.compile("\\d{3}");

//        Finding words irrespective of case
//        input = "Java is fun. java is powerful. JAVA is everywhere.";
//        Pattern pattern = Pattern.compile("java", Pattern.CASE_INSENSITIVE);

//        Match 3-letter word
//        input = "Can man fay ran pan";
//        Pattern pattern = Pattern.compile("[a-z]an");

//        Excluding plural forms of a word
//        input = "cats scatter for the black cat";
//        Pattern pattern = Pattern.compile("cat(?!s)");

//        Match Date
        input = "Today's date is 22-03-2024.";
        Pattern pattern = Pattern.compile("(?:\\d{2}-){2}\\d{4}");







        printResult(pattern, input);
    }

    public static void printResult(Pattern pattern, String input) {
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
