import java.util.Scanner;

public class SubstringOccurence06 {
    public static void main(String[] args) {
	    // Created a Scanner object to take input from the user
        Scanner input = new Scanner(System.in);
		
		String s = input.nextLine();
		String substring = input.next();
		
		int counter = 0;
		
		for(int i = 0; i < s.length(); i++) {
		    String temp = "";
		    for(int j = i; j < s.length(); j++) {
				char ch = s.charAt(j);
			    temp += ch;
				
				if(substring.equals(temp)) {
				    counter++;
				}
			}
		}
		
		System.out.println("The number of occurence of substring in a given string is : " + counter);
		
		input.close();
	}
}
			    