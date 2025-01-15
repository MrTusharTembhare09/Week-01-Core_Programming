import java.util.Scanner;

public class TextSplitter02 {

    // Method to find the length of the string without using the built-in length() method
    public static int findLength(String text) {
        int length = 0;
        for (char c : text.toCharArray()) {
            length++; // Incrementing length for each character
        }
        return length;
    }

    // Method to split the text into words without using the built-in split() method
    public static String[] splitText(String text) {
        int length = findLength(text); // Finding the length of the string
        int spaceCount = 0; // Counting spaces to determine the number of words

        // Counting spaces in the text to determine the number of words
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        // The number of words is spaces + 1
        String[] words = new String[spaceCount + 1];
        int start = 0; // Start index of a word
        int wordIndex = 0; // Index for words array

        // Splitting the text into words using space as a delimiter
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ' || i == length - 1) {
                int end = (i == length - 1) ? i + 1 : i; // End index for a word
                words[wordIndex++] = text.substring(start, end); // Extracting word
                start = i + 1; // Updating start index to the next word
            }
        }
        return words;
    }

    // Method to compare two string arrays and return a boolean
    public static boolean compareArrays(String[] array1, String[] array2) {
        if (array1.length != array2.length) {
            return false; // If lengths are not equal, arrays are not equal
        }
        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
                return false; // If any word does not match, arrays are not equal
            }
        }
        return true; // Arrays are equal
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a text: ");
        String text = scanner.nextLine();

        // Splitting the text using the built-in split() method
        String[] builtInSplit = text.split(" ");

        // Splitting the text using the custom splitText() method
        String[] customSplit = splitText(text);

        // Comparing the two string arrays
        boolean areEqual = compareArrays(builtInSplit, customSplit);

        // Displaying the results
        System.out.println("Words using built-in split():");
        for (String word : builtInSplit) {
            System.out.println(word);
        }

        System.out.println("\nWords using custom splitText() method:");
        for (String word : customSplit) {
            System.out.println(word);
        }

        System.out.println("\nAre the two methods producing the same result? " + areEqual);

        scanner.close(); // Closing the scanner
    }
}