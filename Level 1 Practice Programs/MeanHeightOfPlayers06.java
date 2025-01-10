import java.util.Scanner;

public class MeanHeightOfPlayers06 {
    public static void main(String[] args) {
        // Create an array to store the heights of the players
        double[] heights = new double[11];
        double sum = 0.0;

        // Take input for the heights of 11 players
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the heights of 11 players:");

        for (int i = 0; i < heights.length; i++) {
            System.out.print("Height of player " + (i + 1) + ": ");
            heights[i] = scanner.nextDouble();
            sum += heights[i]; // Add the height to the sum
        }

        // Calculate the mean height
        double meanHeight = sum / heights.length;

        // Display the mean height
        System.out.println("\nThe mean height of the football team is: " + meanHeight);

        // Close the scanner
        scanner.close();
    }
}
