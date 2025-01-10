import java.util.Scanner;

public class BMICalculator07 {
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Ask for the number of persons to calculate BMI for
        System.out.print("Enter the number of persons: ");
        int numPersons = scanner.nextInt();
        
        // Multi-dimensional array to store weight, height, and BMI
        // Each row corresponds to one person, and columns store [weight, height, BMI]
        double[][] personData = new double[numPersons][3];
        
        // Array to store weight status of the persons
        String[] weightStatus = new String[numPersons];
        
        // Loop to get the weight and height of each person and calculate BMI
        for (int i = 0; i < numPersons; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");
            
            // Input weight and ensure it's a positive value
            double weight;
            do {
                System.out.print("Weight (kg): ");
                weight = scanner.nextDouble();
                if (weight <= 0) {
                    System.out.println("Please enter a positive weight.");
                }
            } while (weight <= 0);
            
            // Input height and ensure it's a positive value
            double height;
            do {
                System.out.print("Height (m): ");
                height = scanner.nextDouble();
                if (height <= 0) {
                    System.out.println("Please enter a positive height.");
                }
            } while (height <= 0);
            
            // Store the weight and height in the personData array
            personData[i][0] = weight;
            personData[i][1] = height;
            
            // Calculate BMI using the formula: BMI = weight / (height * height)
            double bmi = weight / (height * height);
            personData[i][2] = bmi;  // Store BMI in the third column
            
            // Determine weight status based on BMI
            if (bmi <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmi >= 25.0 && bmi <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
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
                (i + 1), personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }
        
        // Close the scanner to free resources
        scanner.close();
    }
}
