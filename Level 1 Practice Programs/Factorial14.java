import java.util.Scanner;

public class Factorial14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input for the number
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        
        // Check if the number is positive
        if (number < 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Calculating factorial using a while loop
            long factorial = 1;
            int i = 1;
            while (i <= number) {
                factorial *= i;
                i++;
            }
            
            // Output the factorial
            System.out.println("The factorial of " + number + " is: " + factorial);
        }
    }
}