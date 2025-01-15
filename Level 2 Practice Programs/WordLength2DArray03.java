import java.util.Scanner;

public class WordLength2DArray03 {

    // Method to find the length of a string without using the built-in length() method
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

    // Method to create a 2D array with words and their lengths
    public static String[][] getWordsWithLengths(String[] words) {
        String[][] wordLengths = new String[words.length][2]; // 2D array to store words and their lengths

        for (int i = 0; i < words.length; i++) {
            wordLengths[i][0] = words[i]; // Storing the word
            wordLengths[i][1] = String.valueOf(findLength(words[i])); // Storing the length as a String
        }

        return wordLengths;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a text: ");
        String text = scanner.nextLine();

        // Splitting the text into words using the custom splitText() method
        String[] words = splitText(text);

        // Getting the 2D array with words and their lengths
        String[][] wordLengths = getWordsWithLengths(words);

        // Displaying the result in a tabular format
        System.out.println("\nWord\tLength");
        System.out.println("----------------");
        for (String[] wordLength : wordLengths) {
            // Converting length back to Integer for display
            int length = Integer.parseInt(wordLength[1]);
            System.out.printf("%s\t%d\n", wordLength[0], length);
        }

        scanner.close(); // Closing the scanner
    }
}