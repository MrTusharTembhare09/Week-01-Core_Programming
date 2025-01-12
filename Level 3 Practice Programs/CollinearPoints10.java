import java.util.*;

public class CollinearPoints10 {

    // Method to check collinearity using slope formula
    public static boolean areCollinearSlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        // Calculate slopes
        double slopeAB = (double) (y2 - y1) / (x2 - x1);
        double slopeBC = (double) (y3 - y2) / (x3 - x2);
        double slopeAC = (double) (y3 - y1) / (x3 - x1);
        
        // Checking if slopes are equal
        return slopeAB == slopeBC && slopeBC == slopeAC;
    }

    // Method to check collinearity using area of the triangle formula
    public static boolean areCollinearArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        // Calculating area
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        
        // Checking if area is 0
        return area == 0;
    }

    public static void main(String[] args) {
        // Sample points
        int x1 = 2, y1 = 4;
        int x2 = 4, y2 = 6;
        int x3 = 6, y3 = 8;
        
        // Checking collinearity using slope formula
        boolean collinearSlope = areCollinearSlope(x1, y1, x2, y2, x3, y3);
        System.out.println("Collinear using slope formula: " + collinearSlope);
        
        // Checking collinearity using area of triangle formula
        boolean collinearArea = areCollinearArea(x1, y1, x2, y2, x3, y3);
        System.out.println("Collinear using area formula: " + collinearArea);
    }
}
