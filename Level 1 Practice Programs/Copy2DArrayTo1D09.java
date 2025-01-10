import java.util.Scanner;

public class Copy2DArrayTo1D09 {
    public static void main(String[] args) {
        // Take user input for rows and columns of the 2D array
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        // Create a 2D array based on user input
        int[][] matrix = new int[rows][columns];
        
        // Fill the 2D array with user input values
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Create a 1D array to store the values from the 2D array
        int[] oneDArray = new int[rows * columns];
        int index = 0; // Index to store values in the 1D array

        // Copy the elements from the 2D array to the 1D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                oneDArray[index++] = matrix[i][j];
            }
        }

        // Display the elements of the 1D array
        System.out.println("\nElements of the 1D array:");
        for (int i = 0; i < oneDArray.length; i++) {
            System.out.print(oneDArray[i] + " ");
        }

        // Close the scanner
        scanner.close();
    }
}
