import java.util.Scanner;

public class SimpleCalculator06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input for the numbers and operator
        System.out.print("Enter first number: ");
        double first = scanner.nextDouble();
        
        System.out.print("Enter second number: ");
        double second = scanner.nextDouble();
        
        System.out.print("Enter operator (+, -, *, /): ");
        String op = scanner.next();
        
        double result;
        
        // Perform operations based on the operator using switch case
        switch (op) {
            case "+":
                result = first + second;
                System.out.println("Result: " + result);
                break;
            case "-":
                result = first - second;
                System.out.println("Result: " + result);
                break;
            case "*":
                result = first * second;
                System.out.println("Result: " + result);
                break;
            case "/":
                if (second != 0) {
                    result = first / second;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operator.");
        }
    }
}