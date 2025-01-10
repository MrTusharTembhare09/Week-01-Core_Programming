import java.util.Scanner;

public class FactorsOfANumber08 {
    public static void main(String[] args) {
        // Take input for the number whose factors need to be found
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Define variables for storing factors and handling dynamic resizing of array
        int maxFactor = 10; // Initial size of factors array
        int[] factors = new int[maxFactor]; // Array to store factors
        int index = 0; // Index for storing factors in the array

        // Find factors of the number and store them in the array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                // Check if the factors array is full
                if (index == maxFactor) {
                    // If full, resize the array by doubling its size
                    maxFactor *= 2;
                    int[] temp = new int[maxFactor];
                    System.arraycopy(factors, 0, temp, 0, factors.length);
                    factors = temp; // Reassign the reference to the resized array
                }

                // Store the factor and increment the index
                factors[index++] = i;
            }
        }

        // Display the factors of the number
        System.out.println("\nFactors of " + number + ":");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }

        // Close the scanner
        scanner.close();
    }
}
