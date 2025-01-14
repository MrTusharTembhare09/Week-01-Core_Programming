import java.util.Scanner;

public class StringToCharArrayComparison03 {

    // Defining a method to return all characters of a string as an array
    public static char[] getCharacters(String str) {
        // Creating an array of characters with the same length as the string
        char[] charArray = new char[str.length()];

        // Loop through the string to extract each character
        for(int i = 0; i < str.length(); i++) {
            charArray[i] = str.charAt(i); // Extracting each character
        }

        // Returning the character array
        return charArray;
    }

    // Defining a method to compare two character arrays
    public static boolean compareCharArrays(char[] array1, char[] array2) {
        // Checking if the lengths of the arrays are equal
        if(array1.length != array2.length) {
            return false;
        }

        // Comparing characters at each position in both arrays
        for(int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false; // Return false if any character differs
            }
        }

        // Return true if all characters match
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking user input for the string
        System.out.print("Enter a string: ");
        String str = input.next();

        // Getting the character array using the user-defined method
        char[] charArrayFromMethod = getCharacters(str);

        // Getting the character array using the built-in toCharArray() method
        char[] charArrayFromBuiltIn = str.toCharArray();

        // Comparing the two character arrays
        boolean areEqual = compareCharArrays(charArrayFromMethod, charArrayFromBuiltIn);

        // Displaying the results
        System.out.println("Character array using user-defined method: ");
        for (char c : charArrayFromMethod) {
            System.out.print(c + " ");
        }

        System.out.println("\nCharacter array using built-in toCharArray() method: ");
        for (char c : charArrayFromBuiltIn) {
            System.out.print(c + " ");
        }

        System.out.println("\nAre the two character arrays equal? " + areEqual);

        input.close(); // Closing the scanner to avoid resource leak
    }
}
