package tasks.javaFundamentals.userWelcome;


import java.time.Month;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UserWelcome {
    private static Scanner scanner = new Scanner(System.in);

        public static void sayHelloUser(){
            System.out.println("enter your name, please");
            System.out.println("Hello, " + scanner.nextLine() + "!");
        }

        public static void revertConsoleArguments(){
            System.out.println("enter a some string");
            Deque<String> scannerStack = Stream.of(scanner.nextLine().split(" ")).collect(Collectors.toCollection(ArrayDeque::new));
            int fixedScannerStackSize = scannerStack.size();
            for (int i = 0; i < fixedScannerStackSize; i++) {
                System.out.println(scannerStack.pollLast());
            }
        }

        public static void showRandomNumbersInOneRow(){
            System.out.println("enter a number for random");
            int quantityOfRandomNumbers = scanner.nextInt();
            for (int i = 0; i < quantityOfRandomNumbers; i++) {
                System.out.print((int)(Math.random()*10) + " ");
            }
            System.out.println("\n");
            scanner.nextLine();
        }

        public static void showRandomNumbersInDifferentRow(){
            System.out.println("enter a number for random");
            int quantityOfRandomNumbers = scanner.nextInt();
            for (int i = 0; i < quantityOfRandomNumbers; i++) {
               System.out.println((int)(Math.random()*10));
            }
            scanner.nextLine();
        }

        public static void addition(){
            System.out.println("enter the numbers to add");
            System.out.println(Stream.of(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).sum());
        }

    public static void main(String[] args) {
        addition();
    }
        public static void multiplication(){
            System.out.println("enter the numbers to multiply");
            System.out.println(Stream.of(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).reduce(1, Math::multiplyExact));
        }

        public static void showMonth() {
            System.out.println("Enter the month number");
            int numberOfMonth = scanner.nextInt();
            if(numberOfMonth > 0 && numberOfMonth <=12) {
                System.out.println(Month.of(numberOfMonth));
            }
            else{
                System.out.println("You entered an invalid month number");
                showMonth();
            }
            scanner.nextLine();
        }
}
