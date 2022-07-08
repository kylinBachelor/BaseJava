package File;

import java.io.File;

public class Example14 {
    public static void main(String[] args) {
        //创建一个代表目录的File对象
        File file = new File("C:\\apache-tomcat-9.0.36");
        fileDir(file);


    }

    public static void fileDir(File dir) {
        File[] files = dir.listFiles();//获得表示目录下所有文件的数组
        for (File file : files) {
            if (file.isDirectory()) {
                fileDir(file);   //如果是目录，则递归调用fielDir
            }
            System.out.println(file.getAbsolutePath());
        }
    }
}
