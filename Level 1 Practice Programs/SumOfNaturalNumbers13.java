import java.util.Scanner;

public class SumOfNaturalNumbers13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input for the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Check if the number is a natural number
        if (number <= 0) {
            System.out.println("Please enter a positive natural number.");
        } else {
            // Computing the sum using the formula
            int formulaSum = number * (number + 1) / 2;
            
            // Computing the sum using a for loop
            int loopSum = 0;
            for (int i = 1; i <= number; i++) {
                loopSum += i;
            }
            
            // Comparing the results and displaying the output
            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using for loop: " + loopSum);
            if (formulaSum == loopSum) {
                System.out.println("Both results match!");
            }
        }
    }
}