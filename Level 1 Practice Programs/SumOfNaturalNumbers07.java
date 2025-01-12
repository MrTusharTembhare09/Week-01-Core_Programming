import java.util.Scanner;

public class SumOfNaturalNumbers07 {
    // Method to find sum of n natural numbers
    public static int sumOfNaturalNumbers(int n) {
        int sum = 0;
        // Loop through 1 to n and add to sum
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        // Calculating sum and output result
        int sum = sumOfNaturalNumbers(n);
        System.out.println("Sum of first " + n + " natural numbers: " + sum);
    }
}
