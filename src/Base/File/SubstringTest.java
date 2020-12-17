package Base.File;

import java.net.FileNameMap;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Auther: MaleHunter
 * @Date: 2020/12/17 10:24
 * @Package: Base.File
 * @CurrentProject: BaseJava
 * @version: 1.0
 */
public class SubstringTest {
    public static void main(String[] args) {
        String fileName = "MaleHunter.txt   ";
        String substring1 = fileName.substring(fileName.lastIndexOf(".") + 1);
        String substring2 = fileName.substring(fileName.lastIndexOf(".") + 1, fileName.length());
        System.out.println("无length   " + substring1);
        System.out.println("有length   " + substring1);
        String datePath = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        System.out.println(datePath);
    }
}
