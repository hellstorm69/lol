// write a java code to find factorial of a number
import java.util.Scanner;

public class FactorialCalculator {

    // Recursive function to calculate factorial
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to find its factorial: ");
        int num = scanner.nextInt();

        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            int result = factorial(num);
            System.out.println("The factorial of " + num + " is: " + result);
        }

        scanner.close();
    }
}
//write a java program for factorial of a number?
