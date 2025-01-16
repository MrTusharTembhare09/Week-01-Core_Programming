import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        // Taking user input for conversion choice
        int choice = getConversionChoice();

        // Handling the user's choice
        if (choice == 1) {
            // Converting Fahrenheit to Celsius
            double fahrenheit = getTemperatureInput("Fahrenheit");
            double celsius = convertFahrenheitToCelsius(fahrenheit);
            displayResult(fahrenheit, "Fahrenheit", celsius, "Celsius");
        } else if (choice == 2) {
            // Converting Celsius to Fahrenheit
            double celsius = getTemperatureInput("Celsius");
            double fahrenheit = convertCelsiusToFahrenheit(celsius);
            displayResult(celsius, "Celsius", fahrenheit, "Fahrenheit");
        } else {
            System.out.println("Invalid choice. Please restart the program.");
        }
    }

    // Creating a method to display conversion options and get the user's choice
    public static int getConversionChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Temperature Converter");
        System.out.println("1. Convert Fahrenheit to Celsius");
        System.out.println("2. Convert Celsius to Fahrenheit");
        System.out.print("Enter your choice (1 or 2): ");
        return scanner.nextInt(); // Returning the user's choice
    }

    // Creating a method to take temperature input from the user
    public static double getTemperatureInput(String scale) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the temperature in " + scale + ": ");
        return scanner.nextDouble(); // Returning the input temperature
    }

    // Creating a method to convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9; // Calculating and returning Celsius
    }

    // Creating a method to convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32; // Calculating and returning Fahrenheit
    }

    // Creating a method to display the conversion result
    public static void displayResult(double inputTemp, String inputScale, double convertedTemp, String convertedScale) {
        System.out.printf("%.2f %s is equal to %.2f %s.%n", inputTemp, inputScale, convertedTemp, convertedScale);
    }
}
