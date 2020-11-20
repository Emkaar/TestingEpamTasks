package tasks.collectionsTask.optional.numbersReverse;

import java.util.Scanner;

public class NumberReverser {
    public static void revertNumbers(){
        Scanner scanner = new Scanner(System.in);
        Integer reverseNumber = Integer.parseInt(new StringBuffer(scanner.nextLine()).reverse().toString());
        System.out.println(reverseNumber);
    }
}
