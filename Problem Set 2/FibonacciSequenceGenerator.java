import java.util.Scanner;

public class FibonacciSequenceGenerator {

    public static void main(String[] args) {
        // Creating a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Taking the number of terms as input from the user
        System.out.print("Enter the number of terms for the Fibonacci sequence: ");
        int terms = scanner.nextInt();

        // Validating input to ensure it's a positive integer
        if (terms <= 0) {
            System.out.println("Please enter a positive number greater than 0.");
        } else {
            // Generating and printing the Fibonacci sequence
            generateFibonacci(terms);
        }
    }

    // Creating a method to generate and print the Fibonacci sequence
    public static void generateFibonacci(int n) {
        int first = 0, second = 1;

        System.out.println("Fibonacci sequence up to " + n + " terms:");

        // Printing the first term
        if (n >= 1) {
            System.out.print(first + " ");
        }

        // Printing the second term
        if (n >= 2) {
            System.out.print(second + " ");
        }

        // Calculating and printing the remaining terms
        for (int i = 3; i <= n; i++) {
            int next = first + second; // Calculating the next term
            System.out.print(next + " "); // Printing the next term
            first = second; // Updating the first number
            second = next; // Updating the second number
        }
    }
}
