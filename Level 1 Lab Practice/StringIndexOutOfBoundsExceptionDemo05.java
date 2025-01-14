import java.util.*;

public class StringIndexOutOfBoundsExceptionDemo05 {

    // Method to generate StringIndexOutOfBoundsException
    public static void generateException(String s) {
        // Accessing an index beyond the string's length
        System.out.println("Accessing character at index 100: " + s.charAt(100)); 
        // This line will throw StringIndexOutOfBoundsException
    }

    // Method to handle StringIndexOutOfBoundsException
    public static void handleException(String s) {
        try {
            // Attempting to access an out-of-bounds index
            System.out.println("Accessing character at index 100: " + s.charAt(100));
        } 
		catch(StringIndexOutOfBoundsException e) {
            // Catching and handling the exception
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking user input for the string
        System.out.print("Enter a string: ");
        String s = input.nextLine();

        System.out.println("\nDemonstrating StringIndexOutOfBoundsException:");

        try {
            // Calling the method that generates the exception
            generateException(s);
        } 
		catch(StringIndexOutOfBoundsException e) {
            System.out.println("Exception occurred in generateException: " + e.getMessage());
        }

        System.out.println("\nDemonstrating handling of StringIndexOutOfBoundsException:");

        // Calling the method that handles the exception
        handleException(s);

        input.close(); // Closing the scanner to avoid resource leaks
    }
}
