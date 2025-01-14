public class NullPointerExceptionDemo04 {

    // Method to generate NullPointerException
    public static void generateException() {
        // Defining a variable and initializing it to null
        String text = null;

        // Calling a String method on the null variable to generate NullPointerException
        System.out.println("Length of the text: " + text.length()); // This line throws the exception
    }

    // Method to handle NullPointerException
    public static void handleException() {
        // Defining a variable and initializing it to null
        String text = null;

        try {
            // Attempting to call a String method on the null variable
            System.out.println("Length of the text: " + text.length());
        } catch (NullPointerException e) {
            // Catching and handling the NullPointerException
            System.out.println("Caught a NullPointerException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println("Demonstrating NullPointerException:");

        try {
            // Calling the method that generates the exception
            generateException();
        } 
		catch(NullPointerException e) {
            System.out.println("Exception occurred in generateException: " + e.getMessage());
        }

        System.out.println("\nDemonstrating handling of NullPointerException:");

        // Calling the method that handles the exception
        handleException();
    }
}
