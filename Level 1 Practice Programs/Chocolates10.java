import java.util.*;

public class Chocolates10 {
    
	// Method 
	public static int[] findRemainderAndQuotient(int number, int divisor) { 
	    int quotient = number / divisor;
        int remainder = number % divisor;
		return new int[]{quotient, remainder};
	}
	
    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
		
		int numberOfChocolates = input.nextInt();
		
		int numberOfChildrens = input.nextInt();
		 
		// Result array
		int result[] = findRemainderAndQuotient(numberOfChocolates, numberOfChildrens);
		
		System.out.println("Number of Chocolates per student : " + result[0]);
		System.out.println("Number of Chocolates remaining : " + result[1]);
		
		input.close();
	}
}