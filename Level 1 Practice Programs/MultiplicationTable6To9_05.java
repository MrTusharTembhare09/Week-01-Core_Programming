import java.util.Scanner;

public class MultiplicationTable6To9_05 {
    public static void main(String[] args) {
        // Take input for the number whose multiplication table will be generated
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to generate tables from 6 to 9: ");
        int number = scanner.nextInt();

        // Validate the number (between 6 and 9)
        if (number < 6 || number > 9) {
            System.out.println("Invalid input! Please enter a number between 6 and 9.");
        } else {
            // Generate the multiplication table for numbers 6 to 9 based on user input
            System.out.println("\nMultiplication Tables from 6 to 9:");

            // Loop through numbers 6 to 9
            for (int i = 6; i <= 9; i++) {
                System.out.println("Multiplication Table of " + i + ":");

                // Loop through 1 to 10 for each number to display the table
                for (int j = 1; j <= 10; j++) {
                    System.out.println(i + " * " + j + " = " + (i * j));
                }
                System.out.println(); // Add an empty line between tables
            }
        }

        // Close the scanner
        scanner.close();
    }
}

