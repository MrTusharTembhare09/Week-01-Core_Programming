import java.util.Scanner;

public class MultiplicationTable03 {
    public static void main(String[] args) {
        // Take input for the number whose multiplication table is to be generated
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Define an array to store the multiplication results from 1 to 10
        int[] multiplicationTable = new int[10];

        // Generate the multiplication table and store the results in the array
        for (int i = 0; i < multiplicationTable.length; i++) {
            multiplicationTable[i] = number * (i + 1);
        }

        // Display the multiplication table from the array
        for (int i = 0; i < multiplicationTable.length; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + multiplicationTable[i]);
        }

        // Close the scanner
        scanner.close();
    }
}
