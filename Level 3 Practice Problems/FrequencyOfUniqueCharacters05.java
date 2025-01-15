import java.util.Scanner;

public class FrequencyOfUniqueCharacters05 {

    // Method to find unique characters in a string using charAt() method
    public static char[] uniqueCharacters(String text) {
        // Create an array to store the unique characters
        char[] uniqueChars = new char[text.length()];
        int uniqueCount = 0;

        // Loop through the text to find unique characters
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            // Nested loop to check if the character is repeated
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            // If the character is unique, add it to the uniqueChars array
            if (isUnique) {
                uniqueChars[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }

        // Return only the part of the array that contains unique characters
        char[] result = new char[uniqueCount];
        System.arraycopy(uniqueChars, 0, result, 0, uniqueCount);
        return result;
    }

    // Method to find the frequency of characters in a string and return a 2D array
    public static String[][] findCharacterFrequency(String text) {
        // Find unique characters in the string
        char[] uniqueChars = uniqueCharacters(text);

        // Create an array to store frequency of characters, there are 256 ASCII characters
        int[] frequency = new int[256];

        // Loop through the text to calculate the frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++; // Increment the frequency of the character
        }

        // Create a 2D array to store unique characters and their frequencies
        String[][] result = new String[uniqueChars.length][2];

        // Loop through the unique characters and store the characters and their frequencies
        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]); // Character
            result[i][1] = String.valueOf(frequency[uniqueChars[i]]); // Frequency
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the string
        System.out.print("Enter a string: ");
        String inputText = scanner.nextLine();

        // Calling the method to find the frequency of unique characters in the string
        String[][] frequencyResult = findCharacterFrequency(inputText);

        // Displaying the result
        System.out.println("Unique character frequencies:");
        for (int i = 0; i < frequencyResult.length; i++) {
            System.out.println("Character: " + frequencyResult[i][0] + " | Frequency: " + frequencyResult[i][1]);
        }

        // Closing the scanner
        scanner.close();
    }
}
