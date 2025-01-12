import java.util.Scanner;

public class BMICalculator10 {

    // Method to calculate BMI for all members and populate the array
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0]; // Weight in kg
            double heightInMeters = data[i][1] / 100; // Converting height from cm to meters
            data[i][2] = weight / (heightInMeters * heightInMeters); // Calculating BMI
        }
    }

    // Method to determine BMI status
    public static String[] determineStatus(double[][] data) {
        String[] statuses = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            if (bmi <= 18.4) {
                statuses[i] = "Underweight";
            } else if (bmi <= 24.9) {
                statuses[i] = "Normal";
            } else if (bmi <= 39.9) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obese";
            }
        }
        return statuses;
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 2D array to store weight, height, and BMI for 10 members
        double[][] teamData = new double[10][3];

        // Taking user input for weight and height
        System.out.println("Enter the weight (in kg) and height (in cm) for 10 team members:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Member " + (i + 1) + " Weight (kg): ");
            teamData[i][0] = scanner.nextDouble(); // Weight
            System.out.print("Member " + (i + 1) + " Height (cm): ");
            teamData[i][1] = scanner.nextDouble(); // Height
        }

        // Calculating BMI for all members
        calculateBMI(teamData);

        // Determine BMI status for all members
        String[] statuses = determineStatus(teamData);

        // Displaying the results
        System.out.println("\nHeight (cm)  Weight (kg)  BMI        Status");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%.2f       %.2f       %.2f    %s%n",
                    teamData[i][1], teamData[i][0], teamData[i][2], statuses[i]);
        }

        scanner.close();
    }
}
