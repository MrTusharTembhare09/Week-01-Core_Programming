import java.util.Scanner;

public class StudentLevels08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Take input for the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        // Step 2: Create arrays to store data
        int[][] marks = new int[numStudents][3]; // Stores marks for Physics, Chemistry, Maths
        double[] percentages = new double[numStudents]; // Stores percentages
        String[] levels = new String[numStudents]; // Stores levels based on percentage

        // Step 3: Input marks for each student and validate
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
                System.out.print(subject + ": ");
                int mark = scanner.nextInt();

                // Validate input for negative marks
                while (mark < 0) {
                    System.out.println("Marks cannot be negative. Please enter positive marks for " + subject + ": ");
                    mark = scanner.nextInt();
                }
                marks[i][j] = mark;
            }
        }

        // Step 4: Calculate percentages and levels
        for (int i = 0; i < numStudents; i++) {
            int totalMarks = marks[i][0] + marks[i][1] + marks[i][2]; // Sum of marks
            percentages[i] = (totalMarks / 3.0); // Calculate percentage

            // Assign level based on percentage
            if (percentages[i] >= 80) {
                levels[i] = "Level 4 (Above agency-normalized standards)";
            } else if (percentages[i] >= 70) {
                levels[i] = "Level 3 (At agency-normalized standards)";
            } else if (percentages[i] >= 60) {
                levels[i] = "Level 2 (Below, but approaching agency standards)";
            } else if (percentages[i] >= 50) {
                levels[i] = "Level 1 (Well below agency standards)";
            } else if (percentages[i] >= 40) {
                levels[i] = "Level 1- (Too below agency standards)";
            } else {
                levels[i] = "Remedial standards";
            }
        }

        // Step 5: Display the results
        System.out.println("\nResults:");
        System.out.println("Student\tPhysics\tChemistry\tMaths\tPercentage\tLevel");
        for (int i = 0; i < numStudents; i++) {
            System.out.printf("%d\t%d\t%d\t\t%d\t%.2f\t\t%s\n",
                    (i + 1), marks[i][0], marks[i][1], marks[i][2], percentages[i], levels[i]);
        }

        scanner.close();
    }
}
