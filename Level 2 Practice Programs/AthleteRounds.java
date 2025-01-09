import java.util.Scanner;

public class AthleteRounds {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Input: Sides of the triangular park
        System.out.print("Enter the length of side 1 (meters): ");
        double side1 = sc.nextDouble();

        System.out.print("Enter the length of side 2 (meters): ");
        double side2 = sc.nextDouble();

        System.out.print("Enter the length of side 3 (meters): ");
        double side3 = sc.nextDouble();

        // Calculate the perimeter of the triangle (total distance covered in one round)
        double perimeter = side1 + side2 + side3;

        // Total distance to run (5 km converted to meters)
        double distanceToRun = 5 * 1000;

        // Calculate the number of rounds (round up to ensure the athlete completes the distance)
        int rounds = (int) Math.ceil(distanceToRun / perimeter);

        // Output the total number of rounds
        System.out.println("The total number of rounds the athlete will run is " + rounds + " to complete 5 km.");
    }
}
