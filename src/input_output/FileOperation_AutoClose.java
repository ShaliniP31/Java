package input_output;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOperation_AutoClose {
    public static void main(String[] args) {
        String readFileName = "D:\\Study\\Code\\Java\\src\\resources\\text1.txt";
        String writeFileName = "D:\\Study\\Code\\Java\\src\\resources\\text12.txt";
        int i;

        try(FileInputStream fis = new FileInputStream(readFileName);
            FileOutputStream fos = new FileOutputStream(writeFileName)){
            do{
                i = fis.read();
                if(i != -1)
                    fos.write((char) i);
            } while(i != -1);
        } catch (IOException e){
            System.out.println("Error reading file");
        }
    }
}
