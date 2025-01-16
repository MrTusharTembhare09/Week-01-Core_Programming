import java.util.Scanner;

public class MaximumOfThreeNumbers {

    public static void main(String[] args) {
        // Creating a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Taking three integer inputs from the user
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        // Calculating the maximum of the three numbers
        int max = findMaximum(num1, num2, num3);

        // Displaying the maximum value
        System.out.println("The maximum of the three numbers is: " + max);
    }

    // Creating a method to find the maximum of three numbers
    public static int findMaximum(int a, int b, int c) {
        int max = a; // Initializing max with the first number
        if (b > max) {
            max = b; // Updating max if the second number is greater
        }
        if (c > max) {
            max = c; // Updating max if the third number is greater
        }
        return max; // Returning the maximum value
    }
}
