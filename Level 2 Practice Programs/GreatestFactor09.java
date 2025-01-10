import java.util.Scanner;

public class GreatestFactor09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Take the input number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int greatestFactor = 1; // Initializing the greatest factor
        
        // Loop from number-1 down to 1
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {
                greatestFactor = i;  // Assign the factor to greatestFactor
                break;  // Exit the loop once the greatest factor is found
            }
        }
        
        // Display the greatest factor
        System.out.println("The greatest factor of " + number + " (besides itself) is: " + greatestFactor);
    }
}