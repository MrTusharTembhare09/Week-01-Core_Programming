public class ReplaceWordInSentence12 {

    // Defining the replace method that takes the sentence, target word, and replacement word as parameters
    public static String replace(String sentence, String target, String replacement) {
        // Splitting the sentence into words using space as a delimiter
        String[] words = sentence.split(" ");

        // Creating a StringBuilder to store the modified sentence
        StringBuilder modifiedSentence = new StringBuilder();

        // Loop through each word in the sentence
        for(String word : words) {
            // Checking if the current word is equal to the target word
            if (word.equals(target)) {
                // If a match is found, replacing the word with the replacement
                modifiedSentence.append(replacement);
            } else {
                // If no match is found, keeping the original word
                modifiedSentence.append(word);
            }
            // Adding a space after each word (except the last one)
            modifiedSentence.append(" ");
        }

        // Converting the StringBuilder to a string and remove the trailing space
        return modifiedSentence.toString().trim();
    }

    public static void main(String[] args) {
        // Testing the replace method
        String sentence = "Hello world, welcome to the world!";
        String target = "Hello";
        String replacement = "Namaste";

        // Calling the replace method and print the modified sentence
        String result = replace(sentence, target, replacement);
        System.out.println("Original Sentence: " + sentence);
        System.out.println("Modified Sentence: " + result);
    }
}

