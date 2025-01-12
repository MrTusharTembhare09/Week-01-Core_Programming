import java.util.*;

public class WindChill_11 {
    // Method to calculate wind chill
    public static double calculateWindChill(double temperature, double windSpeed) {
        // Wind chill formula: 35.74 + 0.6215 * temp + (0.4275 * temp - 35.75) * windSpeed^0.16
        return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {
        double temperature = 30.0;
        double windSpeed = 20.0;

        // Calculating wind chill
        double windChill = calculateWindChill(temperature, windSpeed);

        // Output result
        System.out.println("Wind Chill Temperature: " + windChill);
    }
}
