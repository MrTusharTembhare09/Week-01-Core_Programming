import java.util.Scanner;

// Class to find the youngest and tallest among three friends
public class FriendsComparison08 {

    // Method to find the youngest among the three friends
    public static String findYoungest(String[] names, int[] ages) {
        int youngestAge = ages[0];
        String youngestFriend = names[0];
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < youngestAge) { // Check for younger age
                youngestAge = ages[i];
                youngestFriend = names[i];
            }
        }
        return youngestFriend; // Return the youngest friend's name
    }

    // Method to find the tallest among the three friends
    public static String findTallest(String[] names, double[] heights) {
        double tallestHeight = heights[0];
        String tallestFriend = names[0];
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > tallestHeight) { // Check for taller height
                tallestHeight = heights[i];
                tallestFriend = names[i];
            }
        }
        return tallestFriend; // Return the tallest friend's name
    }

    // Main method to execute the program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initializing arrays to store names, ages, and heights
        String[] friends = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Taking user input for age and height for each friend
        for (int i = 0; i < friends.length; i++) {
            System.out.print("Enter the age of " + friends[i] + ": ");
            ages[i] = scanner.nextInt();
            System.out.print("Enter the height (in cm) of " + friends[i] + ": ");
            heights[i] = scanner.nextDouble();
        }

        // Finding the youngest and tallest friends
        String youngestFriend = findYoungest(friends, ages);
        String tallestFriend = findTallest(friends, heights);

        // Displaying the results
        System.out.println("\nResults:");
        System.out.println("The youngest friend is: " + youngestFriend);
        System.out.println("The tallest friend is: " + tallestFriend);

        scanner.close(); // Closing the scanner
    }
}
