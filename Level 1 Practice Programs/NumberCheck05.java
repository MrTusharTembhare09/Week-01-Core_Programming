// Program 5: Positive, Negative, or Zero Check
import java.util.Scanner;

public class NumberCheck05 {
    
	// Method to check number type
    public static int checkNumber(int number) {
        if (number > 0) {
            return 1;
        } else if (number < 0) {
            return -1;
        } else {
            return 0;
        }
    }
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for a number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Checking if the number is positive, negative, or zero
        int result = checkNumber(number);

        // Displaying the result
        if (result == 1) {
            System.out.println("The number is positive.");
        } else if (result == -1) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
		
		sc.close();
    }
}