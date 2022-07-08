package File;

import java.io.File;

public class Example11 {
    public static void main(String[] args) {
        File file = new File("example.txt");
        //document name
        System.out.println("文件名" + file.getName());
        System.out.println(file.getPath());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getParent());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        System.out.println(file.isAbsolute());
        System.out.println(file.lastModified());
        System.out.println(file.length());
        System.out.println(file.delete());
    }
}
