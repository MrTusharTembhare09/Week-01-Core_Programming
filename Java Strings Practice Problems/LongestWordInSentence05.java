import java.util.Scanner;

public class LongestWordInSentence05 {
    public static void main(String[] args) {
        // Created a Scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Taking the sentence input from the user
        System.out.println("Enter a sentence: ");
        String sentence = input.nextLine();

        // Splitting the sentence into words using space as a delimiter
        String[] words = sentence.split(" ");

        // Variable to store the longest word
        String longestWord = "";

        // Loop through each word in the array
        for(String word : words) {
            // Calculating the length of the current word
            if(word.length() > longestWord.length()) {
                // If the current word is longer, updating the longestWord
                longestWord = word;
            }
        }

        // Output the longest word
        System.out.println("The longest word in the sentence is: " + longestWord);

        // Closing the scanner object to prevent memory leak
        input.close();
    }
}

		
		
			