import java.util.Scanner;

public class DoubleOpt {

    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Input: Variables a, b, c of double data type
        System.out.print("Enter the value of a (double): ");
        double a = sc.nextDouble();

        System.out.print("Enter the value of b (double): ");
        double b = sc.nextDouble();

        System.out.print("Enter the value of c (double): ");
        double c = sc.nextDouble();

        // Perform double operations based on precedence
        double result1 = a + b * c;       // Multiplication has higher precedence than addition
        double result2 = a * b + c;       // Multiplication first, then addition
        double result3 = c + a / b;       // Division first, then addition
        double result4 = a % b + c;       // Modulus first, then addition

        // Output the results
        System.out.println("The results of Double Operations are:");
        System.out.println("a + b * c = " + result1);
        System.out.println("a * b + c = " + result2);
        System.out.println("c + a / b = " + result3);
        System.out.println("a % b + c = " + result4);
    }
}
