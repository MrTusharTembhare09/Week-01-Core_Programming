import java.util.*;

public class NumberChecker05 {

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Found a divisor, so it's not prime
            }
        }
        return true;
    }

    // Method to check if a number is a neon number
    public static boolean isNeon(int number) {
        int square = number * number;
        int sum = 0;
        
        // Sum the digits of the square
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        
        return sum == number; // Checking if the sum of digits is equal to the number
    }

    // Method to check if a number is a spy number
    public static boolean isSpy(int number) {
        int sum = 0;
        int product = 1;
        
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            product *= digit;
            number /= 10;
        }
        
        return sum == product; // Checking if sum equals product
    }

    // Method to check if a number is an automorphic number
    public static boolean isAutomorphic(int number) {
        int square = number * number;
        
        // Checking if the square ends with the number itself
        return square % Math.pow(10, countDigits(number)) == number;
    }

    // Method to check if a number is a buzz number
    public static boolean isBuzz(int number) {
        return number % 7 == 0 || number % 10 == 7; // Divisible by 7 or ends with 7
    }

    // Method to count the number of digits in a number
    public static int countDigits(int number) {
        return Integer.toString(number).length();
    }

    public static void main(String[] args) {
        int number = 25;

        // Displaying results for each method
        System.out.println("Is Prime: " + isPrime(number));
        System.out.println("Is Neon Number: " + isNeon(number));
        System.out.println("Is Spy Number: " + isSpy(number));
        System.out.println("Is Automorphic Number: " + isAutomorphic(number));
        System.out.println("Is Buzz Number: " + isBuzz(number));
    }
}
