import java.util.*;
public class CountdownRocketLaunchWhile08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input for countdown start
        System.out.print("Enter the countdown start number: ");
        int counter = scanner.nextInt();
        
        // Countdown using while loop
        while (counter >= 1) {
            System.out.println("Countdown: " + counter);
            counter--;
        }
    }
}