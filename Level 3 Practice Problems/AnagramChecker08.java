import java.util.Scanner;

public class AnagramChecker08 {

    // Method to check if two texts are anagrams
    public static boolean areAnagrams(String text1, String text2) {
        // Step 1: Check if the lengths of the two texts are equal
        if (text1.length() != text2.length()) {
            return false;  // If lengths are not equal, they cannot be anagrams
        }

        // Step 2: Create arrays to store the frequency of characters in the strings
        int[] freq1 = new int[256]; // Array to store frequency for the first text
        int[] freq2 = new int[256]; // Array to store frequency for the second text

        // Step 3: Find the frequency of characters in the first text
        for (int i = 0; i < text1.length(); i++) {
            freq1[text1.charAt(i)]++;
        }

        // Step 4: Find the frequency of characters in the second text
        for (int i = 0; i < text2.length(); i++) {
            freq2[text2.charAt(i)]++;
        }

        // Step 5: Compare the frequency arrays of the two texts
        for (int i = 0; i < 256; i++) {
            if (freq1[i] != freq2[i]) {
                return false;  // If frequencies are not equal, return false
            }
        }

        // If all frequencies match, the texts are anagrams
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the two texts
        System.out.print("Enter the first text: ");
        String text1 = scanner.nextLine();

        System.out.print("Enter the second text: ");
        String text2 = scanner.nextLine();

        // Check if the two texts are anagrams
        boolean result = areAnagrams(text1, text2);

        // Display the result
        if (result) {
            System.out.println("The texts are anagrams.");
        } else {
            System.out.println("The texts are not anagrams.");
        }

        // Closing the scanner
        scanner.close();
    }
}
