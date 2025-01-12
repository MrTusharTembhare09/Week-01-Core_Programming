import java.util.*;

public class UnitConvertor06 {

    // Converting Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9; // Formula to convert
    }

    // Converting Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32; // Formula to convert
    }

    // Converting pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        return pounds * 0.453592; // Multiply by conversion factor
    }

    // Converting kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * 2.20462; // Multiply by conversion factor
    }

    // Converting gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541; // Multiply by conversion factor
    }

    // Converting liters to gallons
    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172; // Multiply by conversion factor
    }

    // Main method to test the methods
    public static void main(String[] args) {
        System.out.println("98.6°F to Celsius: " + convertFahrenheitToCelsius(98.6) + "°C");
        System.out.println("37°C to Fahrenheit: " + convertCelsiusToFahrenheit(37) + "°F");
        System.out.println("150 pounds to kilograms: " + convertPoundsToKilograms(150) + " kg");
        System.out.println("68 kilograms to pounds: " + convertKilogramsToPounds(68) + " pounds");
        System.out.println("10 gallons to liters: " + convertGallonsToLiters(10) + " liters");
        System.out.println("20 liters to gallons: " + convertLitersToGallons(20) + " gallons");
    }
}
