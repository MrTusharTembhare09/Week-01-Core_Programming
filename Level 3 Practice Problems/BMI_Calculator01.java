import java.util.Scanner;

public class BMI_Calculator01 {

    // Method to find BMI and status for each person given their height and weight
    // Formula: BMI = weight / (height * height) where height is in meters
    public static String[][] calculateBMIAndStatus(double[][] heightWeight) {
        String[][] bmiStatus = new String[heightWeight.length][4]; // 2D array to store BMI, status, and other details
        
        for (int i = 0; i < heightWeight.length; i++) {
            double weight = heightWeight[i][0]; // Weight in kg
            double heightInCm = heightWeight[i][1]; // Height in cm
            double heightInM = heightInCm / 100; // Converting height to meters
            double bmi = weight / (heightInM * heightInM); // BMI formula

            // Determining BMI status based on calculated BMI
            String status;
            if (bmi < 18.5) {
                status = "Underweight";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                status = "Normal weight";
            } else if (bmi >= 25 && bmi <= 29.9) {
                status = "Overweight";
            } else {
                status = "Obese";
            }

            // Storing height, weight, BMI (rounded to 2 decimal places), and status
            bmiStatus[i][0] = String.valueOf(heightWeight[i][1]); // height in cm
            bmiStatus[i][1] = String.valueOf(heightWeight[i][0]); // weight in kg
            bmiStatus[i][2] = String.format("%.2f", bmi); // BMI rounded to 2 decimal places
            bmiStatus[i][3] = status; // BMI status
        }
        return bmiStatus; // Returning 2D string array with height, weight, BMI, and status
    }

    // Method to display the 2D array in a tabular format
    public static void displayBMIReport(String[][] bmiStatus) {
        System.out.println("Person | Height (cm) | Weight (kg) | BMI     | Status");
        System.out.println("--------------------------------------------------------");

        for (int i = 0; i < bmiStatus.length; i++) {
            // Displaying the data in tabular format
            System.out.printf("%-7d | %-12s | %-12s | %-7s | %-15s\n", 
                i + 1, 
                bmiStatus[i][0], 
                bmiStatus[i][1], 
                bmiStatus[i][2], 
                bmiStatus[i][3]);
        }
        System.out.println("--------------------------------------------------------");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating a 2D array to store weight and height of 10 persons
        double[][] heightWeight = new double[10][2]; // First column: weight, Second column: height in cm

        // Taking user inputs for height and weight of 10 persons
        for (int i = 0; i < heightWeight.length; i++) {
            // Taking weight input in kg
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            heightWeight[i][0] = scanner.nextDouble();

            // Taking height input in cm
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            heightWeight[i][1] = scanner.nextDouble();
        }

        // Calling the method to calculate BMI and status
        String[][] bmiStatus = calculateBMIAndStatus(heightWeight);

        // Calling the method to display the BMI report
        displayBMIReport(bmiStatus);

        // Closing the scanner to avoid memory leak
        scanner.close();
    }
}
