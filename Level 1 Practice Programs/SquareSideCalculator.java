import java.util.Scanner;

public class SquareSideCalculator {

    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Input: perimeter of the square
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = sc.nextDouble();

        // Calculate the length of the side of the square
        double side = perimeter / 4;

        // Output the length of the side
        System.out.println("The length of the side of the square is: " + side + " units.");
    }
}
