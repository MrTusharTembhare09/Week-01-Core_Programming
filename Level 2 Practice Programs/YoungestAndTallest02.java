import java.util.Scanner;

public class YoungestAndTallest02 {
    public static void main(String[] args) {
        // Define the arrays for age and height of 3 friends
        int[] age = new int[3];
        double[] height = new double[3];

        // Take user input for age and height of the 3 friends
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of friend " + (i + 1) + ": ");
            age[i] = scanner.nextInt();
            System.out.print("Enter height of friend " + (i + 1) + ": ");
            height[i] = scanner.nextDouble();
        }

        // Find the youngest friend
        int youngestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (age[i] < age[youngestIndex]) {
                youngestIndex = i;
            }
        }

        // Find the tallest friend
        int tallestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (height[i] > height[tallestIndex]) {
                tallestIndex = i;
            }
        }

        // Display the youngest and tallest
        System.out.println("The youngest friend is: Friend " + (youngestIndex + 1) + " with age " + age[youngestIndex]);
        System.out.println("The tallest friend is: Friend " + (tallestIndex + 1) + " with height " + height[tallestIndex]);

        // Close the scanner
        scanner.close();
    }
}
