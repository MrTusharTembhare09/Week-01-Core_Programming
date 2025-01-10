import java.util.Scanner;

public class DigitFrequency10 {
    public static void main(String[] args) {
        // Take user input for a number
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Create an array to store the frequency of each digit (0-9)
        int[] digitFrequency = new int[10];
        
        // Extract digits and count their frequency
        int tempNumber = number;
        
        while (tempNumber > 0) {
            int digit = tempNumber % 10;  // Extract the last digit
            digitFrequency[digit]++;  // Increment the frequency count of that digit
            tempNumber /= 10;  // Remove the last digit from the number
        }
        
        // Display the frequency of each digit (only for digits 0-9 that appear in the number)
        System.out.println("Digit frequencies:");
        for (int i = 0; i < 10; i++) {
            if (digitFrequency[i] > 0) {
                System.out.println("Digit " + i + ": " + digitFrequency[i] + " time(s)");
            }
        }
        
        // Close the scanner
        scanner.close();
    }
}
