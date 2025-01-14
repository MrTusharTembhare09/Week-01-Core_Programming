import java.util.Scanner;

public class LowerCaseComparison10 {

    // Method to convert text to lowercase using charAt()
    public static String convertToLowerUsingCharAt(String text) {
        // Creating a StringBuilder to store the converted text
        StringBuilder lowercaseText = new StringBuilder();

        // Iterating through each character of the text
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // Converting character to lowercase if it's uppercase
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32); // ASCII value adjustment
            }

            // Appending the character to the StringBuilder
            lowercaseText.append(ch);
        }

        // Returning the converted text as a string
        return lowercaseText.toString();
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {
        // Checking if lengths are different
        if (str1.length() != str2.length()) {
            return false;
        }

        // Comparing characters one by one
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false; // Returning false if any character doesn't match
            }
        }

        // Returning true if all characters match
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking user input for the text
        System.out.print("Enter the text: ");
        String text = input.nextLine();

        // Converting text to lowercase using charAt()
        String userDefinedLowercase = convertToLowerUsingCharAt(text);

        // Converting text to lowercase using the built-in method
        String builtInLowercase = text.toLowerCase();

        // Comparing the two results
        boolean areEqual = compareStrings(userDefinedLowercase, builtInLowercase);

        // Displaying the results
        System.out.println("\nConverted text using charAt(): " + userDefinedLowercase);
        System.out.println("Converted text using built-in toLowerCase(): " + builtInLowercase);
        System.out.println("Are both results equal? " + (areEqual ? "Yes" : "No"));

        input.close(); // Closing the scanner to prevent resource leaks
    }
}
