package input_output;

import java.io.*;

public class BufferedReaderExample {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char c;
        System.out.println("Enter characters, 'q' to quit");

        do {
            c = (char) br.read();
            System.out.println(c);
        } while (c != 'q');

        String str;
        System.out.println("Enter strings, 'stop' to quit");

        do {
            str = br.readLine();
            System.out.println(str);
        } while (!str.equals("stop"));

    }
}
