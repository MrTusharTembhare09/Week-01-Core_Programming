import java.util.*;

public class IllegalArgumentExceptionDemo06 {

    // Method to generate IllegalArgumentException
    public static void generateException(String s) {
        System.out.println("Substring: " + s.substring(3,2)); 
        // This line will throw IllegalArgumentException
    }
	
	// Method to handle IllegalArgumentException
    public static void handleException(String s) {
        try {
            // Attempting to access an out-of-bounds index
            System.out.println("Substring: " + s.substring(5,4));
        } 
		catch(IllegalArgumentException e) {
            // Catching and handling the exception
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        }
    }
	
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		// Taking user input for the string
        System.out.print("Enter a string: ");
        String s = input.nextLine();
		
		System.out.println("\nDemonstrating IllegalArgumentException:");
		
		try {
            // Calling the method that generates the exception
            generateException(s);
        } 
		catch(IllegalArgumentException e) {
            System.out.println("Exception occurred in generateException: " + e.getMessage());
        }
		
		System.out.println("\nDemonstrating handling of IllegalArgumentException:");
		
		// Calling the method that handles the exception
        handleException(s);

        input.close(); // Closing the scanner to avoid resource leaks
	}
}
		