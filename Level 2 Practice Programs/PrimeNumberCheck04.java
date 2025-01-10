import java.util.Scanner;

public class PrimeNumberCheck04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Assume the number is prime initially
        boolean isPrime = true;
        
        // Check for divisibility from 2 to the number-1
        if (number <= 1) {
            isPrime = false;  // Numbers less than or equal to 1 are not prime
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {  // If divisible by any number other than 1 and itself
                    isPrime = false;
                    break;  // Exit the loop since it's not a prime number
                }
            }
        }

        // Output the result
        if (isPrime) {
            System.out.println(number + " is a Prime Number.");
        } else {
            System.out.println(number + " is not a Prime Number.");
        }
    }
}