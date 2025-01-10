import java.util.Scanner;

public class LargestAndSecondLargest03 {
    public static void main(String[] args) {
        // Take input number from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Create an array to store digits
        int maxDigits = 10;
        int[] digits = new int[maxDigits];
        int index = 0;

        // Store digits in the array
        while (number > 0) {
            digits[index] = number % 10; // Get the last digit
            number /= 10; // Remove the last digit
            index++;

            // Increase the array size if needed
            if (index == maxDigits) {
                maxDigits += 10;
                int[] temp = new int[maxDigits];
                System.arraycopy(digits, 0, temp, 0, digits.length);
                digits = temp;
            }
        }

        // Find largest and second largest digits
        int largest = -1, secondLargest = -1;
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] < largest) {
                secondLargest = digits[i];
            }
        }

        // Display the results
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);

        // Close the scanner
        scanner.close();
    }
}
