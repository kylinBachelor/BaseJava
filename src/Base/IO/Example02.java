package Base.IO;
import java.io.FileOutputStream;
public class Example02 {
    public static void main(String[] args) throws Exception {
        try {
            //创建一个文件字节输出流
            FileOutputStream out = new FileOutputStream("src\\test.txt", true);
            String str = "传智播客";
            byte[] bytes = str.getBytes();
            for (int i = 0; i < bytes.length; i++) {
                out.write(bytes[i]);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            //out.close();

        }

    }
}
