import java.util.Scanner;

public class VowelConsonantCounter06 {

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

    // Method to find vowels and consonants in a string and return details in a 2D array
    public static String[][] findVowelsAndConsonants(String text) {
        String[][] resultArray = new String[text.length()][2];

        // Iterate through each character in the string
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            resultArray[i][0] = String.valueOf(currentChar);
            resultArray[i][1] = checkVowelOrConsonant(currentChar);
        }

        return resultArray;
    }

    // Method to display the 2D array in a tabular format
    public static void displayResult(String[][] resultArray) {
        System.out.printf("%-10s %-15s%n", "Character", "Type");
        System.out.println("-------------------------");
        for (String[] entry : resultArray) {
            System.out.printf("%-10s %-15s%n", entry[0], entry[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        // Finding vowels and consonants
        String[][] resultArray = findVowelsAndConsonants(text);

        // Displaying the result
        displayResult(resultArray);

        scanner.close(); // Closing the scanner
    }
}