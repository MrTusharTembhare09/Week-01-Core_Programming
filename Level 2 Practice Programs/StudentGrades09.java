import java.util.Random;
import java.util.Scanner;

public class StudentGrades09 {

    // Method for generating random 2-digit scores for Physics, Chemistry, and Math
    public static int[][] generateRandomScores(int numberOfStudents) {
        Random rand = new Random();
        int[][] scores = new int[numberOfStudents][3];
        for (int i = 0; i < numberOfStudents; i++) {
            scores[i][0] = rand.nextInt(90) + 10; // Physics score between 10 and 99
            scores[i][1] = rand.nextInt(90) + 10; // Chemistry score between 10 and 99
            scores[i][2] = rand.nextInt(90) + 10; // Math score between 10 and 99
        }
        return scores;
    }
	
	// Method for calculating total, average, and percentage for each student
    public static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][3];
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return results;
    }
	
	// Method for calculating grades based on percentage
    public static char[] calculateGrades(double[][] results) {
        char[] grades = new char[results.length];
        for (int i = 0; i < results.length; i++) {
            double percentage = results[i][2];
            if (percentage >= 80) {
                grades[i] = 'A';
            } else if (percentage >= 70) {
                grades[i] = 'B';
            } else if (percentage >= 60) {
                grades[i] = 'C';
            } else if (percentage >= 50) {
                grades[i] = 'D';
            } else if (percentage >= 40) {
                grades[i] = 'E';
            } else {
                grades[i] = 'R';
            }
        }
        return grades;
    }
	
	// Method for displaying the scorecard of all students
    public static void displayScorecard(int[][] scores, double[][] results, char[] grades) {
        System.out.println("Scorecard:");
        System.out.println("Student\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage\tGrade");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d\t%d\t%d\t%d\t%.0f\t%.2f\t%.2f\t%c\n", 
                i + 1, scores[i][0], scores[i][1], scores[i][2], results[i][0], results[i][1], results[i][2], grades[i]);
        }
    }

    public static void main(String[] args) {
        // Taking input for the number of students
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Generating random scores for the students
        int[][] scores = generateRandomScores(numberOfStudents);
        
        // Calculating total, average, and percentage for each student
        double[][] results = calculateResults(scores);
        
        // Calculating grades for each student
        char[] grades = calculateGrades(results);
        
        // Displaying the scorecard of all students
        displayScorecard(scores, results, grades);
    }
}
