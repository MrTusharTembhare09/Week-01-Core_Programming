import java.util.Scanner;

public class EmployeeBonus17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input for salary and years of service
        System.out.print("Enter employee salary: ");
        double salary = scanner.nextDouble();
        
        System.out.print("Enter years of service: ");
        int yearsOfService = scanner.nextInt();
        
        // Check if the employee is eligible for bonus
        if (yearsOfService > 5) {
            // Calculating the bonus
            double bonus = salary * 0.05;
            System.out.println("The bonus amount is: " + bonus);
        } else {
            System.out.println("No bonus as years of service are less than 5.");
        }
    }
}