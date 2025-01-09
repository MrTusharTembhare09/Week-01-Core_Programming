import java.util.Scanner;

public class SimpleInterestCalculator {

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Input: Principal, Rate, and Time
        System.out.print("Enter the principal amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter the rate of interest: ");
        double rate = sc.nextDouble();

        System.out.print("Enter the time period (in years): ");
        double time = sc.nextDouble();

        // Calculate Simple Interest using the formula
        double simpleInterest = (principal * rate * time) / 100;

        // Output the result
        System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + principal + 
                           ", Rate of Interest " + rate + " and Time " + time);
    }
}
