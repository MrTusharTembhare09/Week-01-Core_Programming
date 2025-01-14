// Importing the Scanner class for user input
import java.util.Scanner;

public class PalindromeCheck03 {

    public static void main(String[] args) {
        // Creating a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Prompting the user to enter a string
        System.out.print("Enter a string to check if it's a palindrome: ");
        String s = input.nextLine();

        // Initializing variables for the original and reversed strings
        String reversed = "";
        String original = s; // Storing the original string for comparison

        // Iterating through the input string in reverse order
        for(int i = s.length() - 1; i >= 0; i--) {
            reversed += s.charAt(i); // Appending each character to the reversed string
        }

        // Checking if the original string is equal to the reversed string
        if (original.equals(reversed)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        // Closing the scanner to free resources
        input.close();
    }
}