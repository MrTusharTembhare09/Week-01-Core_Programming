import java.util.Scanner;

public class NumberFormatExceptionDemo07 {

    // Method to generate NumberFormatException
    public static void generateException(String s) {
        // Parsing a string to integer to generate NumberFormatException
        int number = Integer.parseInt(s); // This line throws NumberFormatException
        System.out.println("Parsed Number: " + number);
    }

    // Method to handle NumberFormatException
    public static void handleException(String s) {
        try {
            // Attempting to parse string to integer
            int number = Integer.parseInt(s);
            System.out.println("Parsed Number: " + number);
        } 
		catch(NumberFormatException e) {
            // Catching and handling the NumberFormatException
            System.out.println("Caught NumberFormatException: Input is not a valid integer.");
        } 
		catch(RuntimeException e) {
            // Catching any generic runtime exception
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking user input for the string
        System.out.print("Enter a string: ");
        String s = input.nextLine();

        System.out.println("\nDemonstrating NumberFormatException:");

        try {
            // Calling the method that generates the exception
            generateException(s);
        } 
		catch(NumberFormatException e) {
            System.out.println("Exception occurred in generateException: Input is not a valid integer.");
        }

        System.out.println("\nDemonstrating handling of NumberFormatException:");

        // Calling the method that handles the exception
        handleException(s);

        input.close(); // Closing the scanner to avoid resource leaks
    }
}
