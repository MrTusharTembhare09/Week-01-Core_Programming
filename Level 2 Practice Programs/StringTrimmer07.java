import java.util.Scanner;

public class StringTrimmer07 {

    // Method to trim leading and trailing spaces using charAt()
    public static int[] trimSpaces(String text) {
        int start = 0;
        int end = text.length() - 1;

        // Finding the first non-space character
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }

        // Finding the last non-space character
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    // Method to create a substring using charAt()
    public static String createSubstring(String text, int start, int end) {
        StringBuilder result = new StringBuilder();

        for (int i = start; i <= end; i++) {
            result.append(text.charAt(i));
        }

        return result.toString();
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a string with leading and trailing spaces: ");
        String text = scanner.nextLine();

        // Trimming spaces using custom method
        int[] trimIndexes = trimSpaces(text);
        String trimmedCustom = createSubstring(text, trimIndexes[0], trimIndexes[1]);

        // Trimming spaces using built-in trim method
        String trimmedBuiltIn = text.trim();

        // Comparing the two results
        boolean areEqual = compareStrings(trimmedCustom, trimmedBuiltIn);

        // Displaying the results
        System.out.println("Trimmed string (custom method): '" + trimmedCustom + "'");
        System.out.println("Trimmed string (built-in method): '" + trimmedBuiltIn + "'");
        System.out.println("Are both methods producing the same result? " + areEqual);

        scanner.close(); // Closing the scanner
    }
}