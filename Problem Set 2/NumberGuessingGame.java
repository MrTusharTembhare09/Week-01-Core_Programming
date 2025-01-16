import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    // Declaring the main method
    public static void main(String[] args) {
        // Initializing variables for the range
        int lowerBound = 1;
        int upperBound = 100;
        boolean guessedCorrectly = false;

        // Creating a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Printing the instructions
        System.out.println("Think of a number between 1 and 100.");
        System.out.println("The computer will try to guess it.");
        System.out.println("Provide feedback: 'high', 'low', or 'correct'.");
        
        // Loop until the computer guesses correctly
        while (!guessedCorrectly) {
            // Generating a guess
            int guess = generateGuess(lowerBound, upperBound);

            // Displaying the computer's guess
            System.out.println("Is your number " + guess + "?");
            System.out.print("Enter feedback ('high', 'low', 'correct'): ");
            String feedback = scanner.nextLine().toLowerCase();

            // Handling user feedback
            switch (feedback) {
                case "high":
                    // Updating the upper bound if the guess is high
                    upperBound = guess - 1;
                    break;
                case "low":
                    // Updating the lower bound if the guess is low
                    lowerBound = guess + 1;
                    break;
                case "correct":
                    // Ending the loop if the guess is correct
                    guessedCorrectly = true;
                    System.out.println("The computer guessed your number: " + guess);
                    break;
                default:
                    // Printing an error message for invalid feedback
                    System.out.println("Invalid feedback! Please enter 'high', 'low', or 'correct'.");
            }
        }
    }

    // Creating a method to generate a random guess within a range
    public static int generateGuess(int lower, int upper) {
        Random random = new Random();
        return random.nextInt(upper - lower + 1) + lower;
    }
}
