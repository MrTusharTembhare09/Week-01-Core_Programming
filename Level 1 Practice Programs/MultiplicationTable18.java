import java.util.Scanner;

public class MultiplicationTable18  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input for the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Check if the number is a natural number
        if (number <= 0) {
            System.out.println("Please enter a positive natural number.");
        } else {
            // Using a for loop to print the multiplication table from 6 to 9
            for (int i = 6; i <= 9; i++) {
                System.out.println(number + " * " + i + " = " + (number * i));
            }
        }
    }
}