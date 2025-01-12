import java.util.Scanner;

public class Quadratic11 {

    // Method to find roots of the quadratic equation
    public static double[] findRoots(double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4 * a * c; // Calculating the discriminant (delta)

        if (delta > 0) {
            // Two distinct roots
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{root1, root2};
        } else if (delta == 0) {
            // One repeated root
            double root = -b / (2 * a);
            return new double[]{root};
        } else {
            // No real roots (delta is negative)
            return new double[]{}; // Returning an empty array
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for a, b, and c
        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();

        // Validating if 'a' is zero (not a quadratic equation)
        if (a == 0) {
            System.out.println("This is not a quadratic equation as a = 0.");
        } else {
            // Finding roots using the method
            double[] roots = findRoots(a, b, c);

            // Displaying the roots
            if (roots.length == 2) {
                System.out.println("The roots are real and distinct:");
                System.out.printf("Root 1: %.2f\n", roots[0]);
                System.out.printf("Root 2: %.2f\n", roots[1]);
            } else if (roots.length == 1) {
                System.out.println("The roots are real and equal:");
                System.out.printf("Root: %.2f\n", roots[0]);
            } else {
                System.out.println("There are no real roots (delta is negative).");
            }
        }

        scanner.close();
    }
}
