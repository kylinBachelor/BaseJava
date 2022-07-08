package File;

import java.io.File;

public class DelDocAndDir {
    public static void main(String[] args) {
        File file = new File("E:\\c93aff615492c5810effbc1bb7a501fa\\目录说明.txt");
        if(file.exists()){
            System.out.println(file.delete());
        }

    }

}
