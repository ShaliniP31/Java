package miscellaneous;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        Pattern pattern;
        Matcher matcher;

        pattern = Pattern.compile("Java");
        matcher = pattern.matcher("Java");
        System.out.println(matcher.matches());

        matcher = pattern.matcher("I love Java");
        System.out.println(matcher.matches());
        System.out.println(matcher.find());

        matcher = pattern.matcher("Testing Java against Java");
        while (matcher.find()) {
            System.out.println("Java found at index: " + matcher.start());
        }

        pattern = Pattern.compile("W+");
        matcher = pattern.matcher("W WW WWW");

        while (matcher.find()){
            System.out.println(matcher.group());
        }

        //Character class
        pattern = Pattern.compile("[a-z]+");
        matcher = pattern.matcher("This is a test");

        while (matcher.find()){
            System.out.println(matcher.group());
        }

        pattern = Pattern.compile("[ ,.!]");
        String[] strs = pattern.split("one two,alpha9 12!done.");

        for (String s: strs){
            System.out.println(s);
        }
    }
}
