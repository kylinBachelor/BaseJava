package File;

import java.io.File;

public class Example12 {
    public static void main(String[] args) {
        File file = new File("C:\\apache-tomcat-9.0.36");
        if(file.isDirectory()){  //判断目录是否存在
            String[] names = file.list();  //获得目录下的所有的文件名
            for (String name : names)
            {
                System.out.println(name);  //获得文件名
            }
        }
    }
}
