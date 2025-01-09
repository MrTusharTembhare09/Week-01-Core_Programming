import java.util.Scanner;

public class IntOperation {

    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Input: Variables a, b, c
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();

        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();

        System.out.print("Enter the value of c: ");
        int c = sc.nextInt();

        // Perform integer operations based on precedence
        int result1 = a + b * c;       // Multiplication has higher precedence than addition
        int result2 = a * b + c;       // Multiplication first, then addition
        int result3 = c + a / b;       // Division first, then addition
        int result4 = a % b + c;       // Modulus first, then addition

        // Output the results
        System.out.println("The results of Int Operations are:");
        System.out.println("a + b * c = " + result1);
        System.out.println("a * b + c = " + result2);
        System.out.println("c + a / b = " + result3);
        System.out.println("a % b + c = " + result4);
    }
}
