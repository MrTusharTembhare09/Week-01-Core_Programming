import java.util.Scanner;

public class EmployeeBonus01 {
    public static void main(String[] args) {
        // Define the number of employees
        int numEmployees = 10;
        
        // Define arrays to store salaries, years of service, bonus, and new salary
        double[] salary = new double[numEmployees];
        int[] yearsOfService = new int[numEmployees];
        double[] bonus = new double[numEmployees];
        double[] newSalary = new double[numEmployees]; // Ensure this array is initialized

        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        // Take user input for salary and years of service
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numEmployees; i++) {
            System.out.print("Enter salary of employee " + (i + 1) + ": ");
            salary[i] = scanner.nextDouble();

            System.out.print("Enter years of service of employee " + (i + 1) + ": ");
            yearsOfService[i] = scanner.nextInt();

            // Check if the input is valid
            if (salary[i] < 0 || yearsOfService[i] < 0) {
                System.out.println("Invalid input, please enter again.");
                i--; // Decrease index to take input again
                continue;
            }
        }

        // Calculate bonus, new salary, and totals
        for (int i = 0; i < numEmployees; i++) {
            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05; // 5% bonus for more than 5 years
            } else {
                bonus[i] = salary[i] * 0.02; // 2% bonus for less than 5 years
            }
            newSalary[i] = salary[i] + bonus[i]; // Ensure newSalary is calculated

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i]; // This should work as newSalary is initialized
        }

        // Display the results
        System.out.println("Total bonus payout: " + totalBonus);
        System.out.println("Total old salary: " + totalOldSalary);
        System.out.println("Total new salary: " + totalNewSalary);

        // Close the scanner
        scanner.close();
    }
}
