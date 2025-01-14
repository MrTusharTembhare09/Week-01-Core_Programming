import java.util.HashMap;
import java.util.Map;

public class MostFrequentCharacter09 {

    // Defining a method to find the most frequent character
    public static char findMostFrequentCharacter(String s) {
        // Creating a HashMap to store the frequency of each character
        Map<Character, Integer> frequencyMap = new HashMap<>();
        
        // Loop through each character in the string
        for(char c : s.toCharArray()) {
            // Updating the frequency count of each character in the map
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        // Finding the character with the highest frequency
        char mostFrequentChar = ' ';
        int maxCount = 0;
        
        for(Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            // Checking if the current character has the highest frequency
            if(entry.getValue() > maxCount) {
                mostFrequentChar = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        // Returning the most frequent character
        return mostFrequentChar;
    }

    public static void main(String[] args) {
        // Testing the findMostFrequentCharacter method
        String s = "success";
        
        // Calling the method to get the most frequent character
        char result = findMostFrequentCharacter(s);
        
        // Printing the result
        System.out.println("Most Frequent Character: '" + result + "'");
    }
}
