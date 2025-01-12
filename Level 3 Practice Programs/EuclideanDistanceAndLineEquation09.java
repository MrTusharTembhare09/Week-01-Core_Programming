import java.util.Scanner;

public class EuclideanDistanceAndLineEquation09 {

    // Method to find the Euclidean distance between two points
    public static double findEuclideanDistance(double x1, double y1, double x2, double y2) {
        // Formula for Euclidean distance
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    // Method to find the equation of the line given two points
    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        // Computing the slope m
        double m = (y2 - y1) / (x2 - x1);

        // Computing the y-intercept b
        double b = y1 - m * x1;

        // Returning the slope and y-intercept in an array
        return new double[]{m, b};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking inputs for the two points (x1, y1) and (x2, y2)
        System.out.print("Enter x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = scanner.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = scanner.nextDouble();

        // Calculating the Euclidean distance
        double distance = findEuclideanDistance(x1, y1, x2, y2);
        System.out.printf("The Euclidean distance between the two points is: %.2f\n", distance);

        // Calculating the line equation (slope and y-intercept)
        double[] lineEquation = findLineEquation(x1, y1, x2, y2);
        double slope = lineEquation[0];
        double intercept = lineEquation[1];

        // Printing the equation of the line
        System.out.printf("The equation of the line is: y = %.2fx + %.2f\n", slope, intercept);
    }
}
