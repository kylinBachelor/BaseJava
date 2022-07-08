package IO;

import java.io.FileInputStream;
import java.io.IOException;

public class Example01 {
    public static void main(String[] args) throws IOException {
        //创建一个文件字节输入流；
       FileInputStream in = new FileInputStream("test.txt");
        int b = 0;  //定义一个 int 类型的变量 b ,记住每次读取的一个字
        while (true){
            b =in.read();
            if(b == -1){
                break;
            }
            System.out.println(b);  //否则将 b 写出

        }
        in.close();
        System.out.println("第二段开始");
        FileInputStream fileInputStream = new FileInputStream("test.txt");
        //fileInputStream.read();
        System.out.println(fileInputStream.read());
        System.out.println(fileInputStream.read());
        System.out.println(fileInputStream.read());
        System.out.println(fileInputStream.read());
    }
}
