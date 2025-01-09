import java.util.Scanner;

public class SwapNumbers {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Input: Take two numbers from the user
        System.out.print("Enter the first number (number1): ");
        int number1 = sc.nextInt();

        System.out.print("Enter the second number (number2): ");
        int number2 = sc.nextInt();

        // Display the original numbers
        System.out.println("Before swapping: number1 = " + number1 + ", number2 = " + number2);

        // Swap the numbers using a third variable
        int temp = number1; // Store the value of number1 in temp
        number1 = number2;  // Assign the value of number2 to number1
        number2 = temp;     // Assign the value of temp (original number1) to number2

        // Output: Display the swapped numbers
        System.out.println("After swapping: number1 = " + number1 + ", number2 = " + number2);
    }
}
