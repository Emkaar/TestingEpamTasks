package tasks.javaFundamentals.optional;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NumbersUtil {
    private static Scanner scanner = new Scanner(System.in);

    public static void findMaxAndMinLengthNumber(){
        List<String> numbersInStrings = Stream.of(scanner.nextLine().split(" ")).
                sorted(Comparator.comparingInt(String::length)).collect(Collectors.toList());
        System.out.println("min number " + numbersInStrings.get(0) + " with length " + numbersInStrings.get(0).length());
        System.out.println("max number " + numbersInStrings.get(numbersInStrings.size() - 1) +
                " with length " + numbersInStrings.get(numbersInStrings.size() - 1).length());
    }


    public static void findBiggerThanAverageNumber(){
        List<String>numbersInStrings = Stream.of(scanner.nextLine().split(" ")).collect(Collectors.toList());
        Double averageNumber = numbersInStrings.stream().mapToDouble(Double::parseDouble).average().getAsDouble();
        for (String s : numbersInStrings) {
            if(Double.parseDouble(s) > averageNumber){
                System.out.println(s + " with length " + s.length());
            }
        }
    }

    public static void findSmallestThanAverageNumber(){
        List<String>numbersInStrings = Stream.of(scanner.nextLine().split(" ")).collect(Collectors.toList());
        Double averageNumber = numbersInStrings.stream().mapToDouble(Double::parseDouble).average().getAsDouble();
        for (String s : numbersInStrings) {
            if(Double.parseDouble(s) < averageNumber){
                System.out.println(s + " with length " + s.length());
            }
        }
    }

    public static void findNumberWithMinDifferentNumbers(){
        List<String>numbersInStrings = Stream.of(scanner.nextLine().split(" ")).collect(Collectors.toList());
        String numberWithMaxSameNumbers = null;
        int indexOfSameNumbers = 2_147_483_647;
        for (String number : numbersInStrings){
            int numberCharsCount = (int) number.chars().distinct().count();
                if(numberCharsCount < indexOfSameNumbers){
                    indexOfSameNumbers = numberCharsCount;
                    numberWithMaxSameNumbers = number;
            }
        }
        System.out.println(numberWithMaxSameNumbers);
    }

    public static void findCountsOfFullEvenNumbersAndHalfEvenNumbers(){
        List<String> numbersInString = Stream.of(scanner.nextLine().split(" ")).collect(Collectors.toList());
        int fullEvenNumbersCount = (int) numbersInString.stream().filter((s) -> (s.chars().allMatch((i)->(i%2==0)))).count();
        int halfEvenNumbersCount = (int) numbersInString.stream().filter((s)->(
                (s.chars().filter((i)->(i%2==0)).count()) == (s.chars().filter((i)->(i%2==1)).count()))).count();
        System.out.println("Numbers containing only even numbers " + fullEvenNumbersCount);
        System.out.println("Numbers containing half even and half odd numbers " + halfEvenNumbersCount);
    }
}
