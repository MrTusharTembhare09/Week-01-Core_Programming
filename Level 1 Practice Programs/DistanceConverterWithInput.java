// Program 8: Convert Distance in KM to Miles with User Input
public class DistanceConverterWithInput {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        // Take user input for kilometers
        System.out.print("Enter distance in kilometers: ");
        double kilometers = input.nextDouble();
        // Conversion factor
        double conversionFactor = 1.6;
        // Convert to miles
        double miles = kilometers / conversionFactor;
        // Print the result
        System.out.println("The total miles is " + miles + " mile for the given " + kilometers + " km");
    }
}