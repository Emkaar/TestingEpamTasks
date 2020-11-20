package tasks.collectionsTask.optional.reverseWriter;

import java.io.*;
import java.util.*;

//The implementation uses a list, not a stack or queue, since this condition is specified in the task

public class ReverseWriter {
    public static void writeReverseIntoFile(String filePath) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
            String line;
            List<String> readList = new ArrayList<>();
            while((line = bufferedReader.readLine())!= null){
                readList.add(line);
                System.out.println(line);
            }
            FileWriter fileWriter = new FileWriter(filePath);
            for(int i = readList.size(); i > 0; i--){
                fileWriter.write(readList.get(i-1));
                fileWriter.append("\n");
            }
            fileWriter.flush();
            bufferedReader.close();
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("file not found");
            e.printStackTrace();
        }
    }
}
