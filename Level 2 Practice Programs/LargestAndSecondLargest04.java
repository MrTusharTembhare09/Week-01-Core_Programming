import java.util.Scanner;

public class LargestAndSecondLargest04 {
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user to enter a number
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();
        
        // Maximum digits we can store initially
        int maxDigit = 10;
        
        // Array to store the digits of the number
        int[] digits = new int[maxDigit];
        
        // Variable to track the number of digits stored in the array
        int index = 0;
        
        // Loop to extract digits from the number and store them in the digits array
        while (number > 0) {
            // If the array is full (index equals maxDigit), increase the array size by 10
            if (index == maxDigit) {
                maxDigit += 10;
                // Create a new temporary array with a larger size
                int[] tempArray = new int[maxDigit];
                // Copy the current digits array into the tempArray
                System.arraycopy(digits, 0, tempArray, 0, digits.length);
                // Assign the tempArray to the digits array
                digits = tempArray;
            }
            
            // Extract the last digit and store it in the digits array
            digits[index++] = (int)(number % 10);
            
            // Remove the last digit from the number
            number /= 10;
        }
        
        // Now find the largest and second largest digits in the digits array
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
        // Loop through the digits array to find the largest and second largest digits
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
        
        // Close the scanner to free resources
        scanner.close();
    }
}
