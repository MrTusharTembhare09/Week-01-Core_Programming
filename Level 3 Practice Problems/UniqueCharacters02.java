import java.util.Scanner;

public class UniqueCharacters02 {

    // Method to find the length of the text without using the String method length()
    public static int findLength(String text) {
        int length = 0;
        // Looping through each character in the text using charAt()
        while (true) {
            try {
                // Trying to access the character at the current position
                text.charAt(length);
                length++; // Incrementing the length if the character exists
            } catch (StringIndexOutOfBoundsException e) {
                // If the exception occurs, it means the end of the string is reached
                break;
            }
        }
        return length; // Returning the calculated length
    }

    // Method to find unique characters in a string using charAt() method
    public static char[] findUniqueCharacters(String text) {
        int length = findLength(text); // Finding the length of the text
        char[] uniqueChars = new char[length]; // Array to store the unique characters
        int uniqueCount = 0; // To track the number of unique characters found

        // Outer loop iterates through each character
        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i); // Get the current character from the string

            // Inner loop checks if the current character is unique
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == currentChar) { // If the character is already found
                    isUnique = false;
                    break; // No need to check further if it's not unique
                }
            }

            // If the character is unique, store it in the uniqueChars array
            if (isUnique) {
                uniqueChars[uniqueCount] = currentChar; // Storing unique character
                uniqueCount++; // Incrementing the count of unique characters
            }
        }

        // Creating a new array with the exact number of unique characters
        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = uniqueChars[i]; // Copying unique characters to the result array
        }

        return result; // Returning the result array with unique characters
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the string
        System.out.print("Enter a string: ");
        String inputText = scanner.nextLine();

        // Calling the method to find unique characters in the string
        char[] uniqueCharacters = findUniqueCharacters(inputText);

        // Displaying the result
        System.out.print("Unique characters in the string: ");
        for (char ch : uniqueCharacters) {
            System.out.print(ch + " "); // Printing each unique character
        }

        // Closing the scanner
        scanner.close();
    }
}
