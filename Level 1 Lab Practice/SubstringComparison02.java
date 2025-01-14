import java.util.Scanner;

public class SubstringComparison02 {

    // Defining a method to create a substring using the charAt() method
    public static String createSubstringUsingCharAt(String str, int start, int end) {
        StringBuilder substring = new StringBuilder();

        // Loop through the specified range and append characters to the result
        for(int i = start; i < end; i++) {
            substring.append(str.charAt(i));
        }

        // Returning the substring as a string
        return substring.toString();
    }

    // Defining a method to compare two strings using the charAt() method
    public static boolean compareUsingCharAt(String str1, String str2) {
        // Checking if the lengths of the two strings are the same
        if(str1.length() != str2.length()) {
            return false;
        }

        // Comparing characters of both strings one by one
        for(int i = 0; i < str1.length(); i++) {
            if(str1.charAt(i) != str2.charAt(i)) {
                return false; // Return false if any character differs
            }
        }

        // If all characters match, returning true
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking user input for the string and indices
        System.out.print("Enter the string: ");
        String str = input.next();

        System.out.print("Enter the start index: ");
        int start = input.nextInt();

        System.out.print("Enter the end index: ");
        int end = input.nextInt();

        // Creating substring using the charAt() method
        String substringUsingCharAt = createSubstringUsingCharAt(str, start, end);

        // Creating substring using the built-in substring() method
        String substringUsingBuiltIn = str.substring(start, end);

        // Comparing the two substrings using the charAt() method
        boolean areEqual = compareUsingCharAt(substringUsingCharAt, substringUsingBuiltIn);

        // Displaying the results
        System.out.println("Substring using charAt(): " + substringUsingCharAt);
        System.out.println("Substring using built-in substring(): " + substringUsingBuiltIn);
        System.out.println("Are the substrings equal? " + areEqual);

        input.close(); // Closing the scanner to avoid resource leak
    }
}
