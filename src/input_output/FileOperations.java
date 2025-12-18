package input_output;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOperations {
    public static void main(String[] args) {
        String readFileName = "D:\\Study\\Code\\Java\\src\\resources\\text1.txt";
        String writeFileName = "D:\\Study\\Code\\Java\\src\\resources\\text12.txt";

        FileInputStream fis = null;
        FileOutputStream fos = null;
        int i;

        try {
            fis = new FileInputStream(readFileName);
            fos = new FileOutputStream(writeFileName);
            do {
                i = fis.read();
                if (i != -1) {
                    fos.write((char) i);
                }
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("I/O Error: " + e);
        } finally {
            try {
                if (fis != null)
                    fis.close();
            } catch (IOException e) {
                System.out.println("Error closing input file");
            }

            try {
                if (fos != null)
                    fos.close();
            } catch (IOException e) {
                System.out.println("Error closing output file");
            }
        }
    }
}
