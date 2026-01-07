package utility_classes;

import java.util.StringTokenizer;

public class TokenizerString {
    public static void main(String[] args) {
        String in = "title=Java: The Complete Reference;" +
                "author=Schildt;" +
                "publisher=McGraw Hill;" +
                "copyright=2022";
        StringTokenizer tokens = new StringTokenizer(in, ";=");

        System.out.println(tokens.countTokens());

        while (tokens.hasMoreTokens()) {
            System.out.println(tokens.nextToken());
        }

        System.out.println(tokens.countTokens());
    }
}
