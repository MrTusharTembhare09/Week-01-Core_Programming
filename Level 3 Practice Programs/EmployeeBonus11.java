import java.util.Random;

public class EmployeeBonus11 {

    // Method to generate random salary and years of service for each employee
    public static double[][] generateEmployeeDetails(int numEmployees) {
        Random random = new Random();
        double[][] employeeDetails = new double[numEmployees][2]; // 2D array to store salary and years of service

        for (int i = 0; i < numEmployees; i++) {
            // Generating random 5-digit salary (between 10000 and 99999)
            employeeDetails[i][0] = 10000 + (random.nextDouble() * 90000); 

            // Generating random years of service (between 1 and 20 years)
            employeeDetails[i][1] = 1 + random.nextInt(20);
        }
        return employeeDetails;
    }

    // Method to calculate new salary and bonus for each employee
    public static double[][] calculateNewSalaryAndBonus(double[][] employeeDetails) {
        double[][] updatedDetails = new double[employeeDetails.length][3]; // 2D array to store new salary, bonus and old salary

        for (int i = 0; i < employeeDetails.length; i++) {
            double oldSalary = employeeDetails[i][0];
            double yearsOfService = employeeDetails[i][1];
            double bonus = 0;

            // Calculating bonus based on years of service
            if (yearsOfService > 5) {
                bonus = oldSalary * 0.05; // 5% bonus
            } else {
                bonus = oldSalary * 0.02; // 2% bonus
            }

            // Calculating new salary
            double newSalary = oldSalary + bonus;

            // Store old salary, new salary and bonus
            updatedDetails[i][0] = oldSalary;
            updatedDetails[i][1] = newSalary;
            updatedDetails[i][2] = bonus;
        }
        return updatedDetails;
    }

    // Method to calculate the total old salary, new salary and total bonus
    public static void calculateAndDisplaySalaries(double[][] updatedDetails) {
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;

        System.out.println("Employee Bonus Details:");
        System.out.println("------------------------------------------------------------");
        System.out.printf("%-10s %-15s %-15s %-15s\n", "Employee", "Old Salary", "New Salary", "Bonus");

        // Displaying details for each employee and calculate totals
        for (int i = 0; i < updatedDetails.length; i++) {
            double oldSalary = updatedDetails[i][0];
            double newSalary = updatedDetails[i][1];
            double bonus = updatedDetails[i][2];

            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;

            System.out.printf("%-10d %-15.2f %-15.2f %-15.2f\n", i + 1, oldSalary, newSalary, bonus);
        }

        System.out.println("------------------------------------------------------------");
        System.out.printf("Total Old Salary: %.2f\n", totalOldSalary);
        System.out.printf("Total New Salary: %.2f\n", totalNewSalary);
        System.out.printf("Total Bonus Paid: %.2f\n", totalBonus);
    }

    public static void main(String[] args) {
        int numEmployees = 10;

        // Generating employee details (salary and years of service)
        double[][] employeeDetails = generateEmployeeDetails(numEmployees);

        // Calculating the new salary and bonus for each employee
        double[][] updatedDetails = calculateNewSalaryAndBonus(employeeDetails);

        // Calculating and display the total salaries and bonus
        calculateAndDisplaySalaries(updatedDetails);
    }
}
