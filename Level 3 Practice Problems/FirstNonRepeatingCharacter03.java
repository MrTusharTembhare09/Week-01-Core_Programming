import java.util.Scanner;

public class FirstNonRepeatingCharacter03 {

    // Method to find the first non-repeating character in a string using charAt() method
    public static char findFirstNonRepeatingCharacter(String text) {
        // Array to store frequency of characters, there are 256 ASCII characters
        int[] frequency = new int[256];

        // Looping through the text to calculate the frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i); // Get the character at the current position
            frequency[currentChar]++; // Increment the frequency of the character
        }

        // Looping through the text again to find the first non-repeating character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i); // Get the character at the current position
            // If the frequency of the character is 1, it means it is non-repeating
            if (frequency[currentChar] == 1) {
                return currentChar; // Return the first non-repeating character
            }
        }

        // If no non-repeating character is found, return a special character indicating that
        return '\0'; // Null character to indicate no non-repeating character found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the string
        System.out.print("Enter a string: ");
        String inputText = scanner.nextLine();

        // Calling the method to find the first non-repeating character
        char result = findFirstNonRepeatingCharacter(inputText);

        // Displaying the result
        if (result != '\0') {
            System.out.println("The first non-repeating character is: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }

        // Closing the scanner
        scanner.close();
    }
}
