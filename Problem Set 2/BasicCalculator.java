import java.util.Scanner;

public class BasicCalculator {

    public static void main(String[] args) {
        // Displaying the menu and getting the user's choice
        int choice = getOperationChoice();

        // Taking inputs for the calculation
        double num1 = getNumberInput("first");
        double num2 = getNumberInput("second");

        // Performing the selected operation
        switch (choice) {
            case 1:
                // Calculating addition
                double sum = addNumbers(num1, num2);
                displayResult("Addition", num1, num2, sum);
                break;
            case 2:
                // Calculating subtraction
                double difference = subtractNumbers(num1, num2);
                displayResult("Subtraction", num1, num2, difference);
                break;
            case 3:
                // Calculating multiplication
                double product = multiplyNumbers(num1, num2);
                displayResult("Multiplication", num1, num2, product);
                break;
            case 4:
                // Calculating division
                if (num2 != 0) {
                    double quotient = divideNumbers(num1, num2);
                    displayResult("Division", num1, num2, quotient);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid choice. Please restart the program.");
        }
    }

    // Creating a method to display the operation menu and get user's choice
    public static int getOperationChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Basic Calculator");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter your choice (1-4): ");
        return scanner.nextInt(); // Returning the user's choice
    }

    // Creating a method to get number input from the user
    public static double getNumberInput(String order) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the " + order + " number: ");
        return scanner.nextDouble(); // Returning the input number
    }

    // Creating a method to perform addition
    public static double addNumbers(double a, double b) {
        return a + b; // Returning the sum
    }

    // Creating a method to perform subtraction
    public static double subtractNumbers(double a, double b) {
        return a - b; // Returning the difference
    }

    // Creating a method to perform multiplication
    public static double multiplyNumbers(double a, double b) {
        return a * b; // Returning the product
    }

    // Creating a method to perform division
    public static double divideNumbers(double a, double b) {
        return a / b; // Returning the quotient
    }

    // Creating a method to display the result
    public static void displayResult(String operation, double num1, double num2, double result) {
        System.out.printf("The result of %s between %.2f and %.2f is: %.2f%n", operation, num1, num2, result);
    }
}
