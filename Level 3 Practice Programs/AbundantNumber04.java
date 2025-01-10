import java.util.Scanner;

public class AbundantNumber04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Find sum of divisors
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;  // Add divisors to sum
            }
        }
        
        // Check if sum of divisors is greater than the number
        if (sum > number) {
            System.out.println(number + " is an Abundant number.");
        } else {
            System.out.println(number + " is not an Abundant number.");
        }
    }
}