package tasks.collectionsTask.optional.poemSorter;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PoemSorter {
    public static List<String> sortPoem(String filePath) {
        List<String> poem = new ArrayList<>();

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                poem.add(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return poem.stream().sorted(Comparator.comparingInt(String::length)).collect(Collectors.toList());
    }
}