import java.util.Scanner;

// Class to handle number checks and comparisons
public class NumberAnalysis09 {

    // Method to check if a number is positive or negative
    public static boolean isPositive(int number) {
        return number >= 0; // Returning true if number is positive, false otherwise
    }

    // Method to check if a number is even or odd
    public static boolean isEven(int number) {
        return number % 2 == 0; // Returning true if number is even, false if odd
    }

    // Method to compare two numbers
    public static int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1; // Returning 1 if number1 is greater than number2
        } else if (number1 == number2) {
            return 0; // Returning 0 if both numbers are equal
        } else {
            return -1; // Returning -1 if number1 is less than number2
        }
    }

    // Main method to execute the program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array to store 5 numbers
        int[] numbers = new int[5];

        // Taking user input for the array elements
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("\nAnalysis of Numbers:");
        // Analyzing each number in the array
        for (int number : numbers) {
            if (isPositive(number)) { // Checking if the number is positive
                System.out.print(number + " is Positive ");
                if (isEven(number)) { // Checking if the number is even
                    System.out.println("and Even.");
                } else { // Otherwise, it is odd
                    System.out.println("and Odd.");
                }
            } else { // Number is negative
                System.out.println(number + " is Negative.");
            }
        }

        // Comparing the first and last elements of the array
        System.out.println("\nComparison of First and Last Element:");
        int comparisonResult = compare(numbers[0], numbers[numbers.length - 1]);
        if (comparisonResult == 1) {
            System.out.println("The first element is greater than the last element.");
        } else if (comparisonResult == 0) {
            System.out.println("The first and last elements are equal.");
        } else {
            System.out.println("The first element is less than the last element.");
        }

        scanner.close(); // Closing the scanner
    }
}
