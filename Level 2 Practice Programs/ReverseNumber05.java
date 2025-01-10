import java.util.Scanner;

public class ReverseNumber05 {
    public static void main(String[] args) {
        // Take user input for a number
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Initialize an array to store the digits of the number
        // First, determine how many digits the number has
        int digitCount = (int) Math.log10(number) + 1;
        int[] digits = new int[digitCount];

        // Store the digits of the number in the array
        int tempNumber = number;
        int index = 0;
        
        while (tempNumber > 0) {
            digits[index] = tempNumber % 10;  // Get the last digit
            tempNumber /= 10;  // Remove the last digit from the number
            index++;
        }

        // Display the digits in reverse order
        System.out.print("Reversed number: ");
        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i]);
        }

        // Close the scanner
        scanner.close();
    }
}

