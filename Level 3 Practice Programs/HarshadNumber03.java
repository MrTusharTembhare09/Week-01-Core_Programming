import java.util.Scanner;

public class HarshadNumber03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Calculate sum of digits
        int sum = 0, temp = number;
        while (temp != 0) {
            sum += temp % 10;  // Add last digit to sum
            temp /= 10;         // Remove the last digit
        }
        
        // Check if the number is divisible by the sum of its digits
        if (number % sum == 0) {
            System.out.println(number + " is a Harshad number.");
        } else {
            System.out.println(number + " is not a Harshad number.");
        }
    }
}