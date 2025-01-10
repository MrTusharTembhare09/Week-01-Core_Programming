import java.util.Scanner;

public class FizzBuzz06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Take user input for the number
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        
        int i = 1;
        
        // Use while loop from 1 to the entered number
        while (i <= number) {
            // Check if i is divisible by both 3 and 5
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            // Check if i is divisible by 3
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            // Check if i is divisible by 5
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            // If i is not divisible by 3 or 5, print the number itself
            else {
                System.out.println(i);
            }
            i++; // Increment i
        }
    }
}