package Base.File;

import java.io.File;

public class Example16 {
    public static void main(String[] args) {
        File file = new File("E:\\c93aff615492c5810effbc1bb7a501fa");
        deleteDir(file);

    }
    public static void deleteDir(File dir){
        if(dir.exists()){
            File[] files = dir.listFiles();
            for (File file : files) {
                System.out.println(file);
                if (file.isDirectory()) {
                    deleteDir(file);
                }else{
                    file.delete();
                }
            }
            dir.delete();

        }
    }


}
