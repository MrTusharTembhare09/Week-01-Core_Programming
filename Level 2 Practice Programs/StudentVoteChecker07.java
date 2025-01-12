import java.util.Scanner;

// Class to check if a student can vote
public class StudentVoteChecker07 {

    // Method to check if a student can vote
    public static boolean canStudentVote(int age) {
        if (age < 0) { // Check if the age is a negative number
            return false; // Invalid age, cannot vote
        }
        return age >= 18; // Return true if age is 18 or above
    }

    // Main method to execute the program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner for user input
        int[] studentAges = new int[10]; // Array to store ages of 10 students

        // Loop to take input for each student's age
        for (int i = 0; i < studentAges.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            studentAges[i] = scanner.nextInt(); // Read and store the age
        }

        System.out.println("\nVoting Eligibility Results:");
        // Loop to check and display voting eligibility
        for (int i = 0; i < studentAges.length; i++) {
            int age = studentAges[i]; // Retrieve age from array
            boolean canVote = canStudentVote(age); // Checking eligibility
            if (age < 0) { // Special message for invalid age
                System.out.println("Student " + (i + 1) + " (Age: " + age + ") has entered an invalid age.");
            } else if (canVote) {
                System.out.println("Student " + (i + 1) + " (Age: " + age + ") can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " (Age: " + age + ") cannot vote.");
            }
        }
        scanner.close(); // Closing the scanner
    }
}

