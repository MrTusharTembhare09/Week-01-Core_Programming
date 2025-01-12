import java.util.*;

public class NumberChecker03 {

    // Method to find the count of digits in the number
    public static int countDigits(int number) {
        return Integer.toString(number).length();
    }

    // Method to store the digits of the number in a digits array
    public static int[] storeDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    // Method to find the sum of the digits of a number
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    // Method to find the sum of the squares of the digits of a number
    public static double sumOfSquaresOfDigits(int[] digits) {
        double sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    // Method to check if a number is a Harshad number
    public static boolean isHarshadNumber(int[] digits, int number) {
        int sum = sumOfDigits(digits);
        return number % sum == 0;
    }

    // Method to find the frequency of each digit in the number
    public static int[][] findDigitFrequency(int[] digits) {
        int[][] frequency = new int[10][2];
        
        // Initializing the frequency array
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i;  // The digit itself
            frequency[i][1] = 0;   // Initialize frequency to 0
        }
        
        // Counting the frequency of each digit
        for (int digit : digits) {
            frequency[digit][1]++;
        }
        
        // Filtering out digits with frequency 0 for clarity in output
        int nonZeroCount = 0;
        for (int i = 0; i < 10; i++) {
            if (frequency[i][1] > 0) {
                nonZeroCount++;
            }
        }
        
        // Creating a new array to store only non-zero frequency digits
        int[][] result = new int[nonZeroCount][2];
        int index = 0;
        for (int i = 0; i < 10; i++) {
            if (frequency[i][1] > 0) {
                result[index++] = frequency[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int number = 21;  
        
        // Storing the digits of the number
        int[] digits = storeDigits(number);
        
        // Displaying the results
        System.out.println("Count of digits: " + countDigits(number));
        
        System.out.print("Digits: ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }
        System.out.println();
        
        // Finding the sum of the digits
        System.out.println("Sum of digits: " + sumOfDigits(digits));
        
        // Finding the sum of the squares of the digits
        System.out.println("Sum of squares of digits: " + sumOfSquaresOfDigits(digits));
        
        // Checking if the number is a Harshad number
        System.out.println("Is Harshad Number: " + isHarshadNumber(digits, number));
        
        // Finding the frequency of each digit
        int[][] frequency = findDigitFrequency(digits);
        System.out.println("Digit frequencies: ");
        for (int[] freq : frequency) {
            System.out.println("Digit " + freq[0] + " appears " + freq[1] + " time(s).");
        }
    }
}
