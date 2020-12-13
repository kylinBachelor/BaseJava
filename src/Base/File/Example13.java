package Base.File;

import java.io.File;
import java.io.FilenameFilter;

public class Example13 {
    public static void main(String[] args) {
        File file = new File("C:\\apache-tomcat-9.0.36");
        //创建过滤器
        FilenameFilter filter = new FilenameFilter() {
            //实现 accept 方法
            @Override
            public boolean accept(File dir, String name) {
                File currFile = new File(dir,name);
                //如果文件名以txt结尾返回true ，否则  false
                if(currFile.isFile() && name.endsWith(".txt")){
                    return false ;
                } else  {
                    return true;
                }
            }
        };
        if (file.exists()){
            String[] lists = file.list(filter);
            for (String list : lists){
                System.out.println(list);
            }
        }
    }
}
