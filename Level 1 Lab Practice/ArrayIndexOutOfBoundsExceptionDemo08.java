import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionDemo08 {

    // Method to generate ArrayIndexOutOfBoundsException
    public static void generateException(String[] names) {
        // Accessing an invalid index to generate the exception
        System.out.println("Accessing an invalid index...");
        System.out.println("Name at index 10: " + names[10]); // This line throws ArrayIndexOutOfBoundsException
    }

    // Method to handle ArrayIndexOutOfBoundsException
    public static void handleException(String[] names) {
        try {
            // Attempting to access an invalid index
            System.out.println("Accessing an invalid index...");
            System.out.println("Name at index 10: " + names[10]);
        } 
		catch(ArrayIndexOutOfBoundsException e) {
            // Catching and handling ArrayIndexOutOfBoundsException
            System.out.println("Caught ArrayIndexOutOfBoundsException: Index out of bounds.");
        } 
		catch(RuntimeException e) {
            // Catching any generic runtime exception
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input for the array of names
        System.out.print("Enter the number of names: ");
        int size = input.nextInt();
        input.nextLine(); // Consume the newline

        String[] names = new String[size];
        System.out.println("Enter the names:");
        for(int i = 0; i < size; i++) {
            names[i] = input.nextLine(); // Populating the array
        }

        System.out.println("\nDemonstrating ArrayIndexOutOfBoundsException:");

        try {
            // Calling the method that generates the exception
            generateException(names);
        } 
		catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception occurred in generateException: Index out of bounds.");
        }

        System.out.println("\nDemonstrating handling of ArrayIndexOutOfBoundsException:");

        // Calling the method that handles the exception
        handleException(names);

        input.close(); // Closing the scanner to avoid resource leaks
    }
}
