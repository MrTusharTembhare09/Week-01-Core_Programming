import java.util.Scanner;

public class GCDAndLCMCalculator {

    public static void main(String[] args) {
        // Taking input from the user
        int[] numbers = getInput();

        // Calculating the GCD of the two numbers
        int gcd = calculateGCD(numbers[0], numbers[1]);

        // Calculating the LCM of the two numbers
        int lcm = calculateLCM(numbers[0], numbers[1], gcd);

        // Displaying the results
        displayResults(numbers[0], numbers[1], gcd, lcm);
    }

    // Creating a method to take input from the user
    public static int[] getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        return new int[]{num1, num2}; // Returning both numbers as an array
    }

    // Creating a method to calculate the GCD of two numbers using the Euclidean algorithm
    public static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b; // Storing the value of b
            b = a % b;    // Calculating the remainder
            a = temp;     // Updating a with the previous value of b
        }
        return a; // Returning the GCD
    }

    // Creating a method to calculate the LCM of two numbers
    public static int calculateLCM(int a, int b, int gcd) {
        return (a * b) / gcd; // Calculating and returning the LCM
    }

    // Creating a method to display the results
    public static void displayResults(int num1, int num2, int gcd, int lcm) {
        System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + gcd);
        System.out.println("The LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }
}
