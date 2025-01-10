import java.util.Scanner;

public class CountDigits02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Initialize count to 0
        int count = 0;
        
        // Loop to count digits
        while (number != 0) {
            number /= 10;  // Remove the last digit
            count++;       // Increase the digit count
        }
        
        // Output the digit count
        System.out.println("The number of digits is: " + count);
    }
}