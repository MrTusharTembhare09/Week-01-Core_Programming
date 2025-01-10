import java.util.Scanner;

public class StoreValues04 {
    public static void main(String[] args) {
        // Create an array to store up to 10 double values
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        Scanner scanner = new Scanner(System.in);

        // Use infinite while loop to take user input until a 0 or negative number is entered or array is full
        while (true) {
            System.out.print("Enter a number (or 0 or negative to stop): ");
            double number = scanner.nextDouble();

            // Break the loop if the entered number is 0 or negative or if array is full
            if (number <= 0 || index == numbers.length) {
                break;
            }

            // Store the number in the array and update the index
            numbers[index] = number;
            total += number;  // Add the number to the total sum
            index++;
        }

        // Display all entered numbers
        System.out.println("\nNumbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
        }

        // Display the total of all entered numbers
        System.out.println("\nTotal sum of numbers: " + total);

        // Close the scanner
        scanner.close();
    }
}
