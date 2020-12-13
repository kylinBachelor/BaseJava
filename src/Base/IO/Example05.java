package Base.IO;

import java.io.FileWriter;
import java.io.IOException;

public class Example05 {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("example.txt",true);
        String string = "你好，传智播客";
        fileWriter.write(string);
        fileWriter.write("\r\n"); //将输出语句换行
        fileWriter.close();
    }
}
