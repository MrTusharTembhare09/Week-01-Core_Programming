import java.util.*;

public class RemoveCharacter10 {
    public static void main(String[] args) {
	    // Created a Scanner object to take input from the user
        Scanner input = new Scanner(System.in);
		
		String s = input.nextLine();
		char ch = input.next().charAt(0);
		
		String modifiedString = "";
		
		for(int i = 0; i < s.length(); i++) {
		    if(ch != s.charAt(i))
			    modifiedString += s.charAt(i);
	    }
		
		System.out.println("Modified string is : " + modifiedString);
		
		input.close();
	}
}
		