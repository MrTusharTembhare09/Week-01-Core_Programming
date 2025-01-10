import java.util.Scanner;

public class PowerOfNumber10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Take the number and power as input
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        
        System.out.print("Enter the power: ");
        int power = scanner.nextInt();
        
        // Initialize result to 1
        int result = 1;
        
        // Loop from i = 1 to i <= power
        for (int i = 1; i <= power; i++) {
            result *= number;  // Multiply result by number in each iteration
        }
        
        // Display the result
        System.out.println(number + " raised to the power of " + power + " is: " + result);
    }
}