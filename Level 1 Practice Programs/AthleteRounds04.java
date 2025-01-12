// Program 3: Athlete Rounds in Triangular Park
import java.util.Scanner;

public class AthleteRounds04 {

    // Method to calculate the number of rounds
    public static double calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3; // Calculating perimeter
        return 5000 / perimeter; // Converting 5 km to meters and dividing by perimeter
    }
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for the sides of the triangle
        System.out.print("Enter side 1 of the triangle (in meters): ");
        double side1 = sc.nextDouble();

        System.out.print("Enter side 2 of the triangle (in meters): ");
        double side2 = sc.nextDouble();

        System.out.print("Enter side 3 of the triangle (in meters): ");
        double side3 = sc.nextDouble();

        // Calculating the number of rounds
        double rounds = calculateRounds(side1, side2, side3);

        // Displaying the result
        System.out.println("The athlete needs to complete " + Math.ceil(rounds) + " rounds to cover 5 km.");
		
		sc.close();
    }
}