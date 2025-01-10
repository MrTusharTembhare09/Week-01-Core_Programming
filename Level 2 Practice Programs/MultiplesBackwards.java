import java.util.Scanner;

public class MultiplesBackwards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Take user input for the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Find multiples of the number below 100
        System.out.println("Multiples of " + number + " below 100 are:");
        for (int i = 100; i >= 1; i--) {  // Loop backward from 100 to 1
            if (i % number == 0) {  // Check if i is a multiple of number
                System.out.println(i);
            }
        }
    }
}