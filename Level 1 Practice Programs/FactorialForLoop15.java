import java.util.Scanner;

public class FactorialForLoop15  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input for the number
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        
        // Check if the number is positive
        if (number < 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Calculating factorial using a for loop
            long factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            
            // Output the factorial
            System.out.println("The factorial of " + number + " is: " + factorial);
        }
    }
}