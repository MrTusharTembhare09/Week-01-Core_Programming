import java.util.Scanner;

public class PrimeNumberChecker {

    public static void main(String[] args) {
        // Creating a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Taking a number input from the user
        System.out.print("Enter a number to check if it is prime: ");
        int number = scanner.nextInt();

        // Checking if the number is prime
        boolean isPrime = checkPrime(number);

        // Displaying the result
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    // Creating a method to check if a number is prime
    public static boolean checkPrime(int num) {
        // Handling special cases for numbers less than 2
        if (num < 2) {
            return false; // Numbers less than 2 are not prime
        }

        // Iterating through potential divisors
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                // Returning false if a divisor is found
                return false;
            }
        }

        // Returning true if no divisors are found
        return true;
    }
}
