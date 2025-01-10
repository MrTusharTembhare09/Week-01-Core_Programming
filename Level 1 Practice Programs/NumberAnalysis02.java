import java.util.Scanner;

public class NumberAnalysis02 {
    public static void main(String[] args) {
        // Defining an array to store 5 integers
        int[] numbers = new int[5];
        Scanner scanner = new Scanner(System.in);

        // Taking input for the array
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Processing each number
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                // Checking for positive number
                System.out.print("Number " + numbers[i] + " is positive and ");
                if (numbers[i] % 2 == 0) {
                    // Checking if even
                    System.out.println("even.");
                } else {
                    // Otherwise, it is odd
                    System.out.println("odd.");
                }
            } else if (numbers[i] < 0) {
                // Checking for negative number
                System.out.println("Number " + numbers[i] + " is negative.");
            } else {
                // If neither positive nor negative, it is zero
                System.out.println("Number " + numbers[i] + " is zero.");
            }
        }

        // Comparing the first and last elements of the array
        int first = numbers[0];
        int last = numbers[numbers.length - 1];

        System.out.print("The first element (" + first + ") is ");
        if (first == last) {
            // If both are equal
            System.out.println("equal to the last element (" + last + ").");
        } else if (first > last) {
            // If the first element is greater
            System.out.println("greater than the last element (" + last + ").");
        } else {
            // If the first element is less
            System.out.println("less than the last element (" + last + ").");
        }

        // Closing the scanner
        scanner.close();
    }
}
