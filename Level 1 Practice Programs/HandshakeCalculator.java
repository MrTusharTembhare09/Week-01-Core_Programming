import java.util.Scanner;

public class HandshakeCalculator {

    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Input: number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();

        // Use the combination formula to calculate the maximum number of handshakes
        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Output the maximum number of handshakes
        System.out.println("The maximum number of handshakes among " + numberOfStudents + " students is: " + handshakes);
    }
}
