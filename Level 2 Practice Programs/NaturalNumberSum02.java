import java.util.Scanner;

public class NaturalNumberSum02 {
    
	// Method to calculate sum using recursion
    public static int sumRecursive(int n) {
        if(n == 1) 
		    return 1;  // Base case
        return n + sumRecursive(n - 1);  // Recursive case
    }
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        // Checking if n is a valid natural number
        if(n <= 0) {
            System.out.println("Invalid input, please enter a positive number.");
            return;
        }
        
        // Calculating sum using recursion
        int recursiveSum = sumRecursive(n);
        int formulaSum = (n * (n + 1)) / 2; // Sum using formula
        
        // Comparing results and display
        System.out.println("Sum using recursion: " + recursiveSum);
        System.out.println("Sum using formula: " + formulaSum);
        
        if (recursiveSum == formulaSum) {
            System.out.println("Both methods give the correct sum.");
        } else {
            System.out.println("There is an error in the calculation.");
        }
    }
}
