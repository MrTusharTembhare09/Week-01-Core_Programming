import java.util.Scanner;

public class VowelConsonantCounter05 {

    // Method to check if a character is a vowel or consonant
    public static String checkVowelOrConsonant(char c) {
        // Convert the character to lowercase if it's uppercase
        if (c >= 'A' && c <= 'Z') {
            c = (char) (c + 32);
        }

        // Check if the character is a letter
        if (c >= 'a' && c <= 'z') {
            // Check for vowels
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        } else {
            return "Not a Letter";
        }
    }

    // Method to count vowels and consonants in a string
    public static int[] countVowelsAndConsonants(String text) {
        int vowels = 0;
        int consonants = 0;

        // Iterate through each character in the string
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            String result = checkVowelOrConsonant(currentChar);

            // Increment counters based on the result
            if ("Vowel".equals(result)) {
                vowels++;
            } else if ("Consonant".equals(result)) {
                consonants++;
            }
        }

        // Return the counts as an array
        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        // Counting vowels and consonants
        int[] counts = countVowelsAndConsonants(text);

        // Displaying the result
        System.out.println("\nNumber of Vowels: " + counts[0]);
        System.out.println("Number of Consonants: " + counts[1]);

        scanner.close(); // Closing the scanner
    }
}