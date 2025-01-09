import java.util.Scanner;

public class DistanceConverter {

    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Input: distance in feet
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = sc.nextDouble();

        // Convert feet to yards (1 yard = 3 feet)
        double distanceInYards = distanceInFeet / 3;

        // Convert feet to miles (1 mile = 1760 yards)
        double distanceInMiles = distanceInYards / 1760;

        // Output the distance in yards and miles
        System.out.println("The distance is: " + distanceInYards + " yards or " + distanceInMiles + " miles.");
    }
}
