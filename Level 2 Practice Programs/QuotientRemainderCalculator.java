import java.util.Scanner;

public class QuotientRemainderCalculator {

    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Input: Two numbers from the user
        System.out.print("Enter the first number (dividend): ");
        int number1 = sc.nextInt();

        System.out.print("Enter the second number (divisor): ");
        int number2 = sc.nextInt();

        // Calculate the quotient using division operator
        int quotient = number1 / number2;

        // Calculate the remainder using modulus operator
        int remainder = number1 % number2;

        // Output the quotient and remainder with input numbers
        System.out.println("The Quotient is " + quotient + " and the Remainder is " + remainder 
                           + " for the numbers " + number1 + " and " + number2 + ".");
    }
}
