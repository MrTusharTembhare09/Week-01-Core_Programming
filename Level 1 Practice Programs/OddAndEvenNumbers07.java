import java.util.Scanner;

public class OddAndEvenNumbers07 {
    public static void main(String[] args) {
        // Take input for the upper limit of numbers
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the input is a valid natural number
        if (number <= 0) {
            System.out.println("Error: Please enter a valid positive integer.");
        } else {
            // Define arrays to store odd and even numbers
            int[] evenNumbers = new int[number / 2 + 1];
            int[] oddNumbers = new int[number / 2 + 1];
            int evenIndex = 0, oddIndex = 0;

            // Loop from 1 to the entered number to classify numbers into odd and even
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    evenNumbers[evenIndex++] = i; // Store even number
                } else {
                    oddNumbers[oddIndex++] = i; // Store odd number
                }
            }

            // Display the even numbers
            System.out.println("\nEven numbers:");
            for (int i = 0; i < evenIndex; i++) {
                System.out.print(evenNumbers[i] + " ");
            }

            // Display the odd numbers
            System.out.println("\nOdd numbers:");
            for (int i = 0; i < oddIndex; i++) {
                System.out.print(oddNumbers[i] + " ");
            }
        }

        // Close the scanner
        scanner.close();
    }
}
