import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        // Taking input from the user
        String inputString = getInput();

        // Checking if the input string is a palindrome
        boolean isPalindrome = checkPalindrome(inputString);

        // Displaying the result
        displayResult(inputString, isPalindrome);
    }

    // Creating a method to take user input
    public static String getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check if it is a palindrome: ");
        return scanner.nextLine(); // Returning the input string
    }

    // Creating a method to check if a string is a palindrome
    public static boolean checkPalindrome(String str) {
        // Converting the string to lowercase to ensure case-insensitivity
        str = str.toLowerCase();

        // Initializing pointers for comparison
        int start = 0;
        int end = str.length() - 1;

        // Checking characters from both ends
        while (start < end) {
            // Skipping non-alphanumeric characters
            while (start < end && !Character.isLetterOrDigit(str.charAt(start))) {
                start++;
            }
            while (start < end && !Character.isLetterOrDigit(str.charAt(end))) {
                end--;
            }

            // Comparing characters
            if (str.charAt(start) != str.charAt(end)) {
                return false; // Returning false if characters don't match
            }

            // Moving the pointers inward
            start++;
            end--;
        }

        return true; // Returning true if the string is a palindrome
    }

    // Creating a method to display the result
    public static void displayResult(String str, boolean isPalindrome) {
        if (isPalindrome) {
            System.out.println("\"" + str + "\" is a palindrome.");
        } else {
            System.out.println("\"" + str + "\" is not a palindrome.");
        }
    }
}
