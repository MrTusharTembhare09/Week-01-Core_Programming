import java.util.Scanner;

public class SumUntilZero10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Initializing total sum variable
        double total = 0.0;
        
        // Taking user input and summing until 0 is entered
        while (true) {
            System.out.print("Enter a number (0 to stop): ");
            double number = scanner.nextDouble();
            if (number == 0) {
                break;
            }
            total += number;
        }
        
        System.out.println("Total sum: " + total);
    }
}