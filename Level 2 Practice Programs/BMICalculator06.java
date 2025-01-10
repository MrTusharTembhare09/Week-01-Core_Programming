import java.util.Scanner;

public class BMICalculator06 {
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Ask for the number of persons to calculate BMI for
        System.out.print("Enter the number of persons: ");
        int numPersons = scanner.nextInt();
        
        // Arrays to store the weight, height, BMI, and weight status of each person
        double[] weight = new double[numPersons];  // Array for storing weight
        double[] height = new double[numPersons];  // Array for storing height
        double[] bmi = new double[numPersons];     // Array for storing BMI
        String[] status = new String[numPersons];  // Array for storing weight status
        
        // Loop to get the weight and height of each person and calculate BMI
        for (int i = 0; i < numPersons; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");
            
            // Ask for the weight and height of the person
            System.out.print("Weight (kg): ");
            weight[i] = scanner.nextDouble();
            System.out.print("Height (m): ");
            height[i] = scanner.nextDouble();
            
            // Calculate BMI using the formula: BMI = weight / (height * height)
            bmi[i] = weight[i] / (height[i] * height[i]);
            
            // Determine weight status based on BMI
            if (bmi[i] <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi[i] >= 18.5 && bmi[i] <= 24.9) {
                status[i] = "Normal";
            } else if (bmi[i] >= 25.0 && bmi[i] <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        
        // Display the details of each person
        System.out.println("\nDetails of all persons:");
        System.out.println("-------------------------------------------------------------");
        System.out.println("Person | Weight (kg) | Height (m) | BMI    | Status");
        System.out.println("-------------------------------------------------------------");
        
        // Loop through each person and display their details
        for (int i = 0; i < numPersons; i++) {
            System.out.printf("%-7d| %-12.2f| %-11.2f| %-7.2f| %s\n", 
                (i + 1), weight[i], height[i], bmi[i], status[i]);
        }
        
        // Close the scanner to free resources
        scanner.close();
    }
}
