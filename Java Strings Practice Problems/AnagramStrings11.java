import java.util.*;

public class AnagramStrings11 {
    public static void main(String[] args) {
	    // Created a Scanner object to take input from the user
        Scanner input = new Scanner(System.in);
		
		String s1 = input.nextLine();
		String s2 = input.nextLine();
        
        // Converting string to character array
        char[] charArray1 = s1.toCharArray();
        
        // Sorting the character array
        Arrays.sort(charArray1);
        
        // Converting character array back to string
        String sortedS1 = new String(charArray1);
		
		// Converting string to character array
        char[] charArray2 = s2.toCharArray();
        
        // Sorting the character array
        Arrays.sort(charArray2);
        
        // Converting character array back to string
        String sortedS2 = new String(charArray2);
		
		if(sortedS1.equals(sortedS2)) {
		    System.out.println("These two strings are anagram of each other");
		}
		else {
		    System.out.println("These two strings are not anagram of each other");
		}
		
		input.close();
	}
}
		
        
		
		