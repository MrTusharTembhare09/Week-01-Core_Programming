// Utility class for unit conversions

import java.util.*;

public class UnitConvertor05 {

    // Converting yards to feet
    public static double convertYardsToFeet(double yards) {
        // 1 yard = 3 feet
        double yardsToFeet = 3;
        // Multiplying the input value by the conversion factor
        return yards * yardsToFeet;
    }

    // Converting feet to yards
    public static double convertFeetToYards(double feet) {
        // 1 foot = 0.333333 yards
        double feetToYards = 0.333333;
        // Multiplying the input value by the conversion factor
        return feet * feetToYards;
    }

    // Converting meters to inches
    public static double convertMetersToInches(double meters) {
        // Conversion factor: 1 meter = 39.3701 inches
        double metersToInches = 39.3701;
        // Multiplyingthe input value by the conversion factor
        return meters * metersToInches;
    }

    // Converting inches to meters
    public static double convertInchesToMeters(double inches) {
        // Conversion factor: 1 inch = 0.0254 meters
        double inchesToMeters = 0.0254;
        // Multiplying the input value by the conversion factor
        return inches * inchesToMeters;
    }

    // Converting inches to centimeters
    public static double convertInchesToCentimeters(double inches) {
        // 1 inch = 2.54 centimeters
        double inchesToCm = 2.54;
        // Multiplying the input value by the conversion factor
        return inches * inchesToCm;
    }

    // Main method to test the conversions
    public static void main(String[] args) {
        // Testing yard to feet conversion
        double yards = 5.0;
        System.out.println(yards + " yards is equal to " + convertYardsToFeet(yards) + " feet.");

        // Testing feet to yards conversion
        double feet = 15.0;
        System.out.println(feet + " feet is equal to " + convertFeetToYards(feet) + " yards.");

        // Testing meters to inches conversion
        double meters = 2.0;
        System.out.println(meters + " meters is equal to " + convertMetersToInches(meters) + " inches.");

        // Testing inches to meters conversion
        double inches = 50.0;
        System.out.println(inches + " inches is equal to " + convertInchesToMeters(inches) + " meters.");

        // Testing inches to centimeters conversion
        System.out.println(inches + " inches is equal to " + convertInchesToCentimeters(inches) + " centimeters.");
    }
}
