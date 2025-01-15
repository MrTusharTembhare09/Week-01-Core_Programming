import java.util.*;

public class StringLength01 {

    public static int manualLengthCalculation(String s) {
	
	    int count = 0;
		int idx = 0;
		
		while(true) {
		    try {
		        char ch = s.charAt(idx);
			}
			catch(ArrayIndexOutOfBoundsException e) {
                // Catching and handling ArrayIndexOutOfBoundsException
                System.out.println("Caught ArrayIndexOutOfBoundsException: Index out of bounds.");
            } 
		    catch(RuntimeException e) {
                // Catching any generic runtime exception
                System.out.println("Caught RuntimeException: " + e.getMessage());
				break;
            }
			
			count++;
			idx++;
		}
		
		return count;	
	}
			
    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		
		int length = manualLengthCalculation(s);
		
		int lengthFromBuiltIn = s.length();
		
		System.out.println("Manual length calculation of a string is : " + length);
		System.out.println("BuiltIn length calculation of a string is : " + lengthFromBuiltIn);
	}
}
		
		