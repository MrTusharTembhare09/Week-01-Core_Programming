import java.util.Scanner;

public class TriangleAreaCalculator {

    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Input: base and height of the triangle in centimeters
        System.out.print("Enter the base of the triangle in cm: ");
        double base = sc.nextDouble();

        System.out.print("Enter the height of the triangle in cm: ");
        double height = sc.nextDouble();

        // Calculate the area of the triangle in square centimeters
        double area = 0.5 * base * height;

        // Convert height from centimeters to inches
        double heightInInches = height / 2.54;

        // Output the area in square centimeters and the height in centimeters and inches
        System.out.println("The area of the triangle is: " + area + " square centimeters.");
        System.out.println("Your Height in cm is: " + height + " cm while in inches is: " + heightInInches + " inches.");
    }
}

