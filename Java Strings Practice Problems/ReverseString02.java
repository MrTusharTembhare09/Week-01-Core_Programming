// Importing the Scanner class for user input
import java.util.Scanner;

public class ReverseString02 {

    public static void main(String[] args) {
        // Creating a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Prompting the user to enter a string
        System.out.print("Enter a string to reverse: ");
        String s = input.nextLine();

        // Initializing an empty string to store the reversed result
        String reversed = "";

        // Iterating through the input string in reverse order
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed += s.charAt(i); // Appending each character to the reversed string
        }

        // Displaying the reversed string
        System.out.println("Reversed string: " + reversed);

        // Closing the scanner to free resources
        input.close();
    }
}