package Base.IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//copy document
public class Example04 {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("example.txt");
        int ch;
        while((ch = reader.read()) != -1){
            System.out.println((char) ch);
        }
        reader.close();
    }
}
