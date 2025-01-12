import java.util.Scanner;

public class MaximumHandshakes03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Calculating the maximum number of handshakes using the formula
        int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Displaying the result
        System.out.println("The maximum number of possible handshakes is: " + maxHandshakes);
		
        scanner.close();
    }
}