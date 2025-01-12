import java.util.*;

public class NumberChecker04 {

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

    // Method to reverse the digits array
    public static int[] reverseDigits(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    // Method to compare two arrays and check if they are equal
    public static boolean compareArrays(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }

    // Method to check if a number is a palindrome using the digits array
    public static boolean isPalindrome(int[] digits) {
        int[] reversed = reverseDigits(digits);
        return compareArrays(digits, reversed);
    }

    // Method to check if a number is a duck number using the digits array
    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit != 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int number = 12021;  
        
        // Storing the digits of the number
        int[] digits = storeDigits(number);

        // Displaying the results
        System.out.println("Count of digits: " + countDigits(number));

        System.out.print("Digits: ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }
        System.out.println();

        // Reversing the digits array and display it
        int[] reversedDigits = reverseDigits(digits);
        System.out.print("Reversed digits: ");
        for (int digit : reversedDigits) {
            System.out.print(digit + " ");
        }
        System.out.println();

        // Checking if the number is a palindrome
        System.out.println("Is Palindrome: " + isPalindrome(digits));

        // Checking if the number is a Duck number
        System.out.println("Is Duck Number: " + isDuckNumber(digits));
    }
}
