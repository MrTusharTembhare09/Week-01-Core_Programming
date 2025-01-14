import java.util.Scanner;

public class TextSplitAndLength11 {

    // Method to split the text into words using charAt() method
    public static String[] splitTextIntoWords(String text) {
        StringBuilder word = new StringBuilder();
        String[] words = new String[text.length()]; // Maximum possible words
        int wordCount = 0;

        for(int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // Checking for space or end of text
            if(ch == ' ' || i == text.length() - 1) {
                if(i == text.length() - 1 && ch != ' ') {
                    word.append(ch); // Include the last character if not space
                }
                if(word.length() > 0) {
                    words[wordCount++] = word.toString();
                    word.setLength(0); // Reset for next word
                }
            } 
			else {
                word.append(ch);
            }
        }

        // Returning only the filled part of the array
        String[] result = new String[wordCount];
        System.arraycopy(words, 0, result, 0, wordCount);
        return result;
    }

    // Method to find the length of a string without using length()
    public static int findStringLength(String str) {
        int length = 0;
        for(char c : str.toCharArray()) {
            length++;
        }
        return length;
    }

    // Method to create a 2D array of words and their lengths
    public static String[][] getWordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findStringLength(words[i])); // Converting length to String
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter the text: ");
        String text = input.nextLine();

        // Splitting text into words
        String[] words = splitTextIntoWords(text);

        // Getting words with their lengths
        String[][] wordsWithLengths = getWordsWithLengths(words);

        // Displaying the result in tabular format
        System.out.println("\nWord\tLength");
        System.out.println("---------------");
        for (String[] row : wordsWithLengths) {
            System.out.println(row[0] + "\t" + Integer.parseInt(row[1])); // Converting length back to Integer
        }

        input.close(); // Closing the scanner to prevent resource leaks
    }
}
