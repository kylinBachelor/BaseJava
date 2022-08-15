import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author congpeitong
 * @date 2022-06-27 10:35
 */
public class test {
    public static void main(String[] args) throws IOException {
//        Process process = Runtime.getRuntime().exec("ping www.baidu.com");
//
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream(),"GBK"));
//        String line = null;
//        StringBuilder build = new StringBuilder();
//        while ((line = bufferedReader.readLine()) != null) {
//            line = new String(line.getBytes("UTF-8"));
//            build.append(line);
//        }
//        System.out.println(build);
//        bufferedReader.close();
//        int i = process.exitValue(); //接收执行完毕的返回值
//        if (i != 0) {
//            throw new RuntimeException("cmd执行失败");
//        }
//        process.destroy(); //销毁子进程
//        process = null;
        // boolean a = false;
        // boolean b = true;
        // boolean c = false;
        // boolean d = true;
        // System.out.println( ~2);   // 10
        // System.out.println(a ^ c);
        // System.out.println(b ^ d);
        // System.out.println();
        List<String> list = new ArrayList<>();
        list.add("1111111");
        list.add("222222");
        list.add("3333333");
        long count = list.stream().filter(w -> {
            return "1111111".equals(w) ? true : false;
        }).count();
        ArrayList<Map<String,String>> mapList = new ArrayList<>();
        Map<String, String> map1 = new HashMap<>();
        map1.put("1111","11111");
        Map<String, String> map2 = new HashMap<>();
        map2.put("2222", "22222");
        Map<String, String> map3 = new HashMap<>();
        map3.put("333333", "33333333");
        Map<String, String> map4 = new HashMap<>();
        map4.put("4444444444", "4444444444");
        Map<String, String> map5 = new HashMap<>();
        map5.put("55555555555555", "555555555");
        mapList.add(map1);
        mapList.add(map2);
        mapList.add(map3);
        mapList.add(map4);
        mapList.add(map5);
        mapList.stream().map(w -> w.put("hello", "world")).collect(Collectors.toList());
        System.out.println(list.toString());
        System.out.println(count);
        System.out.println(mapList.toString());
    }
}
