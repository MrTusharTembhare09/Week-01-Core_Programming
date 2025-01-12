import java.util.Random;
import java.util.Scanner;

public class StudentScores12 {
    
    // Method to generate random 2-digit scores for Physics, Chemistry, and Math
    public static int[][] generateScores(int numStudents) {
        Random rand = new Random();
        int[][] scores = new int[numStudents][3];
        
        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = rand.nextInt(90) + 10; // Physics score
            scores[i][1] = rand.nextInt(90) + 10; // Chemistry score
            scores[i][2] = rand.nextInt(90) + 10; // Math score
        }
        
        return scores;
    }
    
    // Method to calculate the total, average, and percentage for each student
    public static double[][] calculateResults(int[][] scores) {
        int numStudents = scores.length;
        double[][] results = new double[numStudents][3];
        
        for (int i = 0; i < numStudents; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            
            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        
        return results;
    }
    
    // Method to display the scorecard of all students
    public static void displayScorecard(int[][] scores, double[][] results) {
        System.out.println("Physics\tChemistry\tMath\tTotal\tAverage\tPercentage");
        
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i][0] + "\t" + scores[i][1] + "\t" + scores[i][2] + "\t" + 
                               results[i][0] + "\t" + results[i][1] + "\t" + results[i][2]);
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        
        // Generating scores
        int[][] scores = generateScores(numStudents);
        
        // Calculating results
        double[][] results = calculateResults(scores);
        
        // Displaying scorecard
        displayScorecard(scores, results);
        
        scanner.close();
    }
}
