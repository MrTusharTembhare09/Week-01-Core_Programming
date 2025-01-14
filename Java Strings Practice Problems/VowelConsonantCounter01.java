// Importing the Scanner class for user input
import java.util.Scanner;

public class VowelConsonantCounter {

    public static void main(String[] args) {
        // Creating a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Prompting the user to enter a string
        System.out.print("Enter a string: ");
        String s = input.nextLine();

        // Initializing counters for vowels and consonants
        int vowelCount = 0;
        int consonantCount = 0;
		int otherSpecialCharactersCount = 0;

        // Converting the input string to lowercase to make the comparison case-insensitive
        s = s.toLowerCase();

        // Iterating through each character in the string
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i); // Extracting each character

            // Checking if the character is a vowel
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++; // Incrementing the vowel counter
            } 
            // Checking if the character is a consonant (alphabet but not a vowel)
            else if (ch >= 'a' && ch <= 'z') {
                consonantCount++; // Incrementing the consonant counter
            }
			else {
			    otherSpecialCharactersCount++;
			}
        }

        // Printing the results to the user
        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
		System.out.println("Number of other special characters: " + otherSpecialCharactersCount);

        // Closing the scanner to free resources
        input.close();
    }
}