import java.util.Random;
import java.util.Scanner;

public class StudentVotingEligibility08 {

    // Method to define random 2-digit ages for students
    public static int[] generateRandomAges(int numberOfStudents) {
        Random random = new Random();
        int[] ages = new int[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            ages[i] = random.nextInt(100); // Generating a random age between 0 and 99
        }

        return ages;
    }

    // Method to determine voting eligibility
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]); // Storing the age

            if (ages[i] < 0) {
                result[i][1] = "false"; // Negative age cannot vote
            } else if (ages[i] >= 18) {
                result[i][1] = "true"; // Age 18 or above can vote
            } else {
                result[i][1] = "false"; // Below 18 cannot vote
            }
        }

        return result;
    }

    // Method to display the 2D array in a tabular format
    public static void displayResults(String[][] data) {
        System.out.println("Age\tCan Vote");
        System.out.println("-------------------");

        for (String[] row : data) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking the number of students as input
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Generating random ages for students
        int[] ages = generateRandomAges(numberOfStudents);

        // Checking voting eligibility
        String[][] results = checkVotingEligibility(ages);

        // Displaying the results
        displayResults(results);

        scanner.close(); // Closing the scanner
    }
}