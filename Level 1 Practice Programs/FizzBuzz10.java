import java.util.Scanner;

public class FizzBuzz10 {
    public static void main(String[] args) {
        // Take user input for the number
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Create an array to store the FizzBuzz results
        String[] result = new String[number + 1];

        // Loop from 1 to the entered number and apply the FizzBuzz logic
        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result[i] = "FizzBuzz"; // Divisible by both 3 and 5
            } else if (i % 3 == 0) {
                result[i] = "Fizz"; // Divisible by 3
            } else if (i % 5 == 0) {
                result[i] = "Buzz"; // Divisible by 5
            } else {
                result[i] = Integer.toString(i); // Not divisible by 3 or 5
            }
        }

        // Print the results in the required format
        for (int i = 1; i <= number; i++) {
            System.out.println("Position " + i + " = " + result[i]);
        }

        // Close the scanner
        scanner.close();
    }
}
