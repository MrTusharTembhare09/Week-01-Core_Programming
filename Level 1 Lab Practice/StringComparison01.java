import java.util.Scanner;

public class StringComparison01 {

    // Defining a method to compare two strings using the charAt() method
    public static boolean compareUsingCharAt(String str1, String str2) {
        // Checking if the lengths of the two strings are the same
        if(str1.length() != str2.length()) {
            return false; // If lengths are not the same, strings are not equal
        }

        // Comparing characters of both strings one by one
        for(int i = 0; i < str1.length(); i++) {
            if(str1.charAt(i) != str2.charAt(i)) {
                return false; // If any character is different, strings are not equal
            }
        }

        // If all characters match, return true
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for two strings
        System.out.print("Enter the first string: ");
        String str1 = scanner.next();

        System.out.print("Enter the second string: ");
        String str2 = scanner.next();

        // Calling the compareUsingCharAt method and storing the result
        boolean resultUsingCharAt = compareUsingCharAt(str1, str2);

        // Using the built-in equals() method to compare the strings
        boolean resultUsingEquals = str1.equals(str2);

        // Printing the results
        System.out.println("Comparison using charAt(): " + resultUsingCharAt);
        System.out.println("Comparison using equals(): " + resultUsingEquals);

        // Checking if the results from both methods are the same
        if(resultUsingCharAt == resultUsingEquals) {
            System.out.println("The results from both methods match.");
        } 
		else {
            System.out.println("The results from both methods do not match.");
        }

        scanner.close(); // Closing the scanner to avoid resource leak
    }
}
