// Program 7: Volume of Earth in km^3 and miles^3
public class EarthVolumeCalculation {
    public static void main(String[] args) {
        // Radius of Earth in km
        double radiusKm = 6378;
        // Conversion factor
        double conversionFactor = 1.6 * 1.6 * 1.6;
        // Volume of Earth
        double volumeKm3 = (4.0 / 3) * Math.PI * Math.pow(radiusKm, 3);
        double volumeMiles3 = volumeKm3 / conversionFactor;
        // Print the result
        System.out.println("The volume of earth in cubic kilometers is " + volumeKm3 + " and cubic miles is " + volumeMiles3);
    }
}