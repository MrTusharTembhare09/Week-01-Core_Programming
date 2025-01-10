import java.util.Scanner;

public class CountdownRocketLaunchFor09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input for countdown start
        System.out.print("Enter the countdown start number: ");
        int counter = scanner.nextInt();
        
        // Countdown using for loop
        for (int i = counter; i >= 1; i--) {
            System.out.println("Countdown: " + i);
        }
    }
}