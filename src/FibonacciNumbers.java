import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of Fibonacci numbers to print: ");
        int count = scanner.nextInt();

        printFibonacciNumbers(count);
    }

    public static void printFibonacciNumbers(int count) {
        int firstNumber = 0;
        int secondNumber = 1;

        System.out.print("Fibonacci Numbers: ");

        for (int i = 0; i < count; i++) {
            System.out.print(firstNumber + " ");

            int nextNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextNumber;
        }
    }
}
