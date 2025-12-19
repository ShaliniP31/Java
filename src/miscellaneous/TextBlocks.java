package miscellaneous;

public class TextBlocks {
    public static void main(String[] args) {
        String str = """
                   Text blocks make
                multiple lines easy.""";
        System.out.println(str);

        String str2 = """
                He said, "The cat is on the roof."
                 She asked, "How did it get up there?"
                """;
        System.out.println(str2);

        String str3 = """
                one \
                two
                three \
                four
                """;
        System.out.println(str3);
    }
}
