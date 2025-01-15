import java.util.Scanner;

public class FrequencyOfCharacters06 {

    // Method to find the frequency of characters in a string
    public static String[] findCharacterFrequency(String text) {
        // Convert the string to a character array
        char[] chars = text.toCharArray();
        // Array to store frequency of each character
        int[] frequency = new int[chars.length];
        // Result array to store the character and its frequency
        String[] result = new String[chars.length];
        
        // Outer loop to iterate through each character in the text
        for (int i = 0; i < chars.length; i++) {
            // Skip the character if it's already counted
            if (chars[i] == '0') {
                continue;
            }
            // Initialize the frequency of the character to 1
            frequency[i] = 1;
            // Inner loop to check for duplicate characters
            for (int j = i + 1; j < chars.length; j++) {
                // If a duplicate character is found, increment the frequency
                if (chars[i] == chars[j]) {
                    frequency[i]++;
                    // Set the duplicate character to '0' to avoid counting it again
                    chars[j] = '0';
                }
            }
            // Store the character and its frequency in the result array
            result[i] = chars[i] + " : " + frequency[i];
        }
        
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the string
        System.out.print("Enter a string: ");
        String inputText = scanner.nextLine();

        // Calling the method to find the frequency of characters in the string
        String[] frequencyResult = findCharacterFrequency(inputText);

        // Displaying the result
        System.out.println("Character frequencies:");
        for (String res : frequencyResult) {
            // Print only non-null results
            if (res != null) {
                System.out.println(res);
            }
        }

        // Closing the scanner
        scanner.close();
    }
}
