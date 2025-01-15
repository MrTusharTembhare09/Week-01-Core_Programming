import java.util.Scanner;

public class CharacterFrequency04 {

    // Method to find the frequency of characters in a string using charAt() method
    public static String[][] findCharacterFrequency(String text) {
        // Array to store frequency of characters, there are 256 ASCII characters
        int[] frequency = new int[256];

        // Looping through the text to calculate the frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i); // Get the character at the current position
            frequency[currentChar]++; // Increment the frequency of the character
        }

        // Count how many characters have non-zero frequencies
        int count = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                count++;
            }
        }

        // Create a 2D array to store characters and their frequencies
        String[][] result = new String[count][2];
        int index = 0;

        // Loop through the frequency array and store the characters and their frequencies
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                result[index][0] = String.valueOf((char) i); // Character at the ASCII index
                result[index][1] = String.valueOf(frequency[i]); // Frequency of the character
                index++;
            }
        }

        return result; // Returning the 2D array with characters and their frequencies
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the string
        System.out.print("Enter a string: ");
        String inputText = scanner.nextLine();

        // Calling the method to find the frequency of characters in the string
        String[][] frequencyResult = findCharacterFrequency(inputText);

        // Displaying the result
        System.out.println("Character frequencies:");
        for (int i = 0; i < frequencyResult.length; i++) {
            System.out.println("Character: " + frequencyResult[i][0] + " | Frequency: " + frequencyResult[i][1]);
        }

        // Closing the scanner
        scanner.close();
    }
}
