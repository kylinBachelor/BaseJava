package IO;

import java.io.*;

public class Eample03 {
    public static void main(String[] args) throws IOException {
        OutputStream outputStream = new FileOutputStream("example.txt",true);
        String string = "welcome";
        byte[] bytes = string.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            outputStream.write(bytes[i]);
        }
        outputStream.close();

    }
}
