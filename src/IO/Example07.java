package IO;

import java.io.*;

public class Example07   {
    public static void main(String[] args) throws IOException {
        FileInputStream in = new FileInputStream("example.txt");
        InputStreamReader inputStreamReader = new InputStreamReader(in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        FileOutputStream outputStream = new FileOutputStream("text.txt");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
        String line;
        while((line = bufferedReader.readLine()) != null){
            bufferedWriter.write(line);
        }
        bufferedReader.close();
        bufferedWriter.close();

    }

}
