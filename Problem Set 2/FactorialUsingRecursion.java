import java.util.Scanner;

public class FactorialUsingRecursion {

    public static void main(String[] args) {
        // Taking input from the user
        int number = getInput();

        // Calculating the factorial using recursion
        long factorial = calculateFactorial(number);

        // Displaying the result
        displayResult(number, factorial);
    }

    // Creating a method to take user input
    public static int getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to calculate its factorial: ");
        return scanner.nextInt(); // Returning the input number
    }

    // Creating a recursive method to calculate factorial
    public static long calculateFactorial(int n) {
        if (n <= 1) {
            return 1; // Returning 1 as the base case for factorial
        }
        return n * calculateFactorial(n - 1); // Recursively calculating factorial
    }

    // Creating a method to display the result
    public static void displayResult(int number, long factorial) {
        System.out.println("The factorial of " + number + " is " + factorial + ".");
    }
}
