import java.util.Scanner;

public class PalindromeChecker07 {

    // Logic 1: Compare characters from the start and end of the string iteratively
    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;

        // Loop through the text and compare characters from both ends
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;  // If characters don't match, it's not a palindrome
            }
            start++;
            end--;
        }
        return true;  // All characters matched, it's a palindrome
    }

    // Logic 2: Recursive method to check palindrome
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        // Base case: if start index is greater than or equal to end index
        if (start >= end) {
            return true;  // It's a palindrome
        }
        // If characters at start and end indices are not equal
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        // Recursive call with start and end indices moving towards the center
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Logic 3: Using character arrays to check palindrome
    public static boolean isPalindromeUsingCharArray(String text) {
        char[] originalArray = text.toCharArray();
        char[] reverseArray = new char[originalArray.length];

        // Reverse the text
        for (int i = 0; i < originalArray.length; i++) {
            reverseArray[i] = originalArray[originalArray.length - 1 - i];
        }

        // Compare original and reversed arrays
        for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i] != reverseArray[i]) {
                return false;  // If characters don't match, it's not a palindrome
            }
        }
        return true;  // All characters matched, it's a palindrome
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the string
        System.out.print("Enter a string to check if it is a palindrome: ");
        String text = scanner.nextLine();

        // Logic 1: Check palindrome iteratively
        boolean resultIterative = isPalindromeIterative(text);
        System.out.println("Using iterative method: " + (resultIterative ? "Palindrome" : "Not a palindrome"));

        // Logic 2: Check palindrome recursively
        boolean resultRecursive = isPalindromeRecursive(text, 0, text.length() - 1);
        System.out.println("Using recursive method: " + (resultRecursive ? "Palindrome" : "Not a palindrome"));

        // Logic 3: Check palindrome using character arrays
        boolean resultCharArray = isPalindromeUsingCharArray(text);
        System.out.println("Using character array method: " + (resultCharArray ? "Palindrome" : "Not a palindrome"));

        // Closing the scanner
        scanner.close();
    }
}
