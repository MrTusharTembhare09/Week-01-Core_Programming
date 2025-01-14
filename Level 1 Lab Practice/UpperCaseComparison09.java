import java.util.Scanner;

public class UpperCaseComparison09 {

    // Method to convert text to uppercase using charAt()
    public static String convertToUpperUsingCharAt(String text) {
        // Creating a StringBuilder to store the converted text
        StringBuilder uppercaseText = new StringBuilder();

        // Iterating through each character of the text
        for(int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // Converting character to uppercase if it's lowercase
            if(ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32); // ASCII value adjustment
            }

            // Appending the character to the StringBuilder
            uppercaseText.append(ch);
        }

        // Returning the converted text as a string
        return uppercaseText.toString();
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {
        // Checking if lengths are different
        if(str1.length() != str2.length()) {
            return false;
        }

        // Comparing characters one by one
        for(int i = 0; i < str1.length(); i++) {
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

        // Converting text to uppercase using charAt()
        String userDefinedUppercase = convertToUpperUsingCharAt(text);

        // Converting text to uppercase using the built-in method
        String builtInUppercase = text.toUpperCase();

        // Comparing the two results
        boolean areEqual = compareStrings(userDefinedUppercase, builtInUppercase);

        // Displaying the results
        System.out.println("\nConverted text using charAt(): " + userDefinedUppercase);
        System.out.println("Converted text using built-in toUpperCase(): " + builtInUppercase);
        System.out.println("Are both results equal? " + (areEqual ? "Yes" : "No"));

        input.close(); // Closing the scanner to prevent resource leaks
    }
}
