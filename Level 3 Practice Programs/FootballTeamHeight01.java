import java.util.*;

public class FootballTeamHeight01 {

    // Method to generate an array of random heights for 11 players
    public int[] generateHeights() {
        int[] heights = new int[11];
        for (int i = 0; i < heights.length; i++) {
            heights[i] = (int) (Math.random() * 101) + 150; // Generating height between 150 and 250
        }
        return heights;
    }

    // Method to find the sum of all elements in the array
    public int findSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    // Method to find the mean height of the players
    public double findMean(int[] heights) {
        int sum = findSum(heights);
        return (double) sum / heights.length;
    }

    // Method to find the shortest height of the players
    public int findShortestHeight(int[] heights) {
        int shortest = heights[0];
        for (int height : heights) {
            if (height < shortest) {
                shortest = height;
            }
        }
        return shortest;
    }

    // Method to find the tallest height of the players
    public int findTallestHeight(int[] heights) {
        int tallest = heights[0];
        for (int height : heights) {
            if (height > tallest) {
                tallest = height;
            }
        }
        return tallest;
    }

    public static void main(String[] args) {
        FootballTeamHeight01 teamHeight = new FootballTeamHeight01();

        // Generating random heights for 11 players
        int[] heights = teamHeight.generateHeights();

        // Calculating sum, mean, shortest, and tallest height
        int sum = teamHeight.findSum(heights);
        double mean = teamHeight.findMean(heights);
        int shortest = teamHeight.findShortestHeight(heights);
        int tallest = teamHeight.findTallestHeight(heights);

        // Displaying the results
        System.out.println("Heights of players in the football team: ");
        for (int height : heights) {
            System.out.print(height + " ");
        }
        System.out.println("\nSum of heights: " + sum);
        System.out.println("Mean height: " + mean);
        System.out.println("Shortest height: " + shortest);
        System.out.println("Tallest height: " + tallest);
    }
}
