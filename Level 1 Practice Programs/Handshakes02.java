// Program 2: Maximum Handshakes Calculation
import java.util.Scanner;

public class Handshakes02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for the number of students
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        // Calculating the maximum number of handshakes
        int handshakes = calculateHandshakes(n);

        // Displaying the result
        System.out.println("The maximum number of handshakes is: " + handshakes);
    }

    // Method to calculate handshakes using combination formula
    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }
}