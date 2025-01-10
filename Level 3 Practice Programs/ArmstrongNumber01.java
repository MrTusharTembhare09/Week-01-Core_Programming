import java.util.Scanner;

public class ArmstrongNumber01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int sum = 0, originalNumber = number;
        
        // Check if the number is Armstrong
        while (number != 0) {
            // Find the last digit
            int digit = number % 10;
            
            // Add the cube of the digit to sum
            sum += Math.pow(digit, 3);
            
            // Remove the last digit
            number /= 10;
        }
        
        // Check if sum and original number are the same
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
    }
}