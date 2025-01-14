// Importing the Scanner class for user input
import java.util.Scanner;

public class RemoveDuplicates04 {

    public static void main(String[] args) {
        // Creating a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Prompting the user to enter a string
        System.out.print("Enter a string to remove duplicates: ");
        String s = input.nextLine();

        // Initializing a StringBuilder to store the result without duplicates
        StringBuilder result = new StringBuilder();

        // Creating a boolean array to track seen characters (ASCII assumption)
        boolean[] seen = new boolean[256];

        // Iterating through the input string
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i); // Extracting each character

            // Checking if the character has not been added yet
            if(!seen[ch]) {
                result.append(ch); // Appending the character to the result
                seen[ch] = true; // Marking the character as seen
            }
        }

        // Displaying the modified string without duplicates
        System.out.println("String after removing duplicates: " + result.toString());

        // Closing the scanner to free resources
        input.close();
    }
}