import java.util.Scanner;

public class FactorsAndMultiples11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Take user input for the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Find factors of the number
        System.out.println("Factors of " + number + " are:");
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {  // Check if i is a factor of number
                System.out.println(i);
            }
        }
        
        // Find multiples of the number below 100
        System.out.println("Multiples of " + number + " below 100 are:");
        for (int i = number; i < 100; i += number) {  // Loop in steps of 'number'
            System.out.println(i);
        }
    }
}