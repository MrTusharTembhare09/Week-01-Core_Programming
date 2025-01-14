import java.util.*;

public class ToggleCase07 {
    public static void main(String[] args) {
        // Defining the input string
        String input = "Hello World!"; 

        // Creating a StringBuilder to store the result
        StringBuilder result = new StringBuilder();

        // Loop through each character in the string
        for(int i = 0; i < input.length(); i++) {
            // Calculating the current character
            char currentChar = input.charAt(i);

            // Toggle the case
            if(Character.isUpperCase(currentChar)) {
                // If the character is uppercase, converting it to lowercase
                result.append(Character.toLowerCase(currentChar));
            } else if(Character.isLowerCase(currentChar)) {
                // If the character is lowercase, converting it to uppercase
                result.append(Character.toUpperCase(currentChar));
            } else {
                // If the character is neither uppercase nor lowercase (e.g., space or punctuation), keeping it unchanged
                result.append(currentChar);
            }
        }

        // Output of toggled case string
        System.out.println("Original String: " + input);
        System.out.println("Toggled Case String: " + result.toString());
    }
}
