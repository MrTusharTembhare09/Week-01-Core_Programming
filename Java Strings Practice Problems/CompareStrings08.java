import java.util.*;

public class CompareStrings08 {
    public static void main(String[] args) {
        // Defining two input strings
        String string1 = "apple";  // First string
        String string2 = "banana"; // Second string

        // Loop through both strings to compare character by character
        int minLength = Math.min(string1.length(), string2.length()); // Calculating the minimum length of the two strings

        // Creating a variable to store the result of the comparison
        int comparisonResult = 0;

        for(int i = 0; i < minLength; i++) {
            // Calculating the current characters from both strings
            char char1 = string1.charAt(i); // Current character from string1
            char char2 = string2.charAt(i); // Current character from string2

            // Comparing the characters lexicographically
            if (char1 < char2) {
                // If character from string1 is smaller, string1 comes before string2
                comparisonResult = -1;
                break;
            } else if(char1 > char2) {
                // If character from string1 is greater, string1 comes after string2
                comparisonResult = 1;
                break;
            }
        }

        // If all characters match, comparing the lengths of the strings
        if(comparisonResult == 0) {
            // If string1 is shorter than string2, string1 comes before string2
            if(string1.length() < string2.length()) {
                comparisonResult = -1;
            }
            // If string1 is longer than string2, string1 comes after string2
            else if(string1.length() > string2.length()) {
                comparisonResult = 1;
            }
        }

        // Result of the lexicographical comparison
        if(comparisonResult == 0) {
            System.out.println("\"" + string1 + "\" is equal to \"" + string2 + "\" lexicographically.");
        } else if(comparisonResult == -1) {
            System.out.println("\"" + string1 + "\" comes before \"" + string2 + "\" in lexicographical order.");
        } else {
            System.out.println("\"" + string1 + "\" comes after \"" + string2 + "\" in lexicographical order.");
        }
    }
}
