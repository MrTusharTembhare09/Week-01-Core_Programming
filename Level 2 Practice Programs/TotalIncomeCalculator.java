import java.util.Scanner;

public class TotalIncomeCalculator {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Input: Take salary from the user
        System.out.print("Enter the salary (INR): ");
        double salary = sc.nextDouble();

        // Input: Take bonus from the user
        System.out.print("Enter the bonus (INR): ");
        double bonus = sc.nextDouble();

        // Compute the total income
        double totalIncome = salary + bonus;

        // Output the result
        System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus +
                           ". Hence, Total Income is INR " + totalIncome + ".");
    }
}
