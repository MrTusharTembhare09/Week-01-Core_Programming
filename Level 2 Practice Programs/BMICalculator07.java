import java.util.Scanner;

public class BMICalculator07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for weight (kg) and height (cm)
        System.out.print("Enter your weight in kg: ");
        double weight = scanner.nextDouble();

        System.out.print("Enter your height in cm: ");
        double heightCm = scanner.nextDouble();

        // Convert height from cm to meters
        double heightMeters = heightCm / 100;

        // Calculate BMI using the formula
        double bmi = weight / (heightMeters * heightMeters);

        // Determine the weight status based on BMI
        String status;
        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi <= 24.9) {
            status = "Normal";
        } else if (bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        // Display the BMI and weight status
        System.out.printf("Your BMI is: %.2f%n", bmi);
        System.out.println("Weight Status: " + status);

        scanner.close();
    }
}