package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * 读写字节
 * @author congpeitong
 * @date 2022-08-16 10:27
 */
public class MyInputStreamByte {
    public static void main(String[] args) throws FileNotFoundException {
        InputStream IS = new InputStream() {
            @Override
            public int read() throws IOException {
                return 0;
            }
        };
        FileInputStream fileIS = new FileInputStream("text.txt");
    }
}
