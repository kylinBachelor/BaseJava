import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author congpeitong
 * @date 2022-06-27 10:35
 */
public class test {
    public static void main(String[] args) throws IOException {
        Process process = Runtime.getRuntime().exec("ping www.baidu.com");

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream(),"GBK"));
        String line = null;
        StringBuilder build = new StringBuilder();
        while ((line = bufferedReader.readLine()) != null) {
            line = new String(line.getBytes("UTF-8"));
            build.append(line);
        }
        System.out.println(build);
        bufferedReader.close();
        int i = process.exitValue(); //接收执行完毕的返回值
        if (i != 0) {
            throw new RuntimeException("cmd执行失败");
        }
        process.destroy(); //销毁子进程
        process = null;
    }
}
