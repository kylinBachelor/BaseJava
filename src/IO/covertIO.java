package IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class covertIO {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("test.txt");
        FileOutputStream outputStream = new FileOutputStream("target.txt",true);
        int length=0;
        while((length=fileInputStream.read()) != -1){
            outputStream.write(length);
        }
        fileInputStream.close();
        outputStream.close();
    }
}


