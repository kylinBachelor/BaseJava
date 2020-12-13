package Base.IO;

import java.io.*;

public class Example06 {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("example.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);
        FileWriter writer = new FileWriter("test.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        String string;
        while ((string = bufferedReader.readLine()) != null) {
            bufferedWriter.write(string);
            bufferedWriter.newLine();
        }
        bufferedReader.close();
        bufferedWriter.close();
    }
}
