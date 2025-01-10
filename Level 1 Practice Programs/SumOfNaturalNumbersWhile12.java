import java.util.*;
public class SumOfNaturalNumbersWhile12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input for the number
        System.out.print("Enter a natural number: ");
        int number = scanner.nextInt();
        
        if (number > 0) {
            // Calculating sum using while loop
            int sum = 0;
            int i = 1;
            while (i <= number) {
                sum += i;
                i++;
            }
            // Sum using formula for comparison
            int formulaSum = (number * (number + 1)) / 2;
            System.out.println("Sum using while loop: " + sum);
            System.out.println("Sum using formula: " + formulaSum);
        } else {
            System.out.println("The number " + number + " is not a natural number");
        }
    }
}