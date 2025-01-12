import java.util.*;

public class NumberChecker06 {

    // Method to find factors of a number and return them as an array
    public static int[] findFactors(int number) {
        int count = 0;

        // Finding the number of factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        // Storing the factors in an array
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    // Method to find the greatest factor using the factors array
    public static int findGreatestFactor(int[] factors) {
        return factors[factors.length - 1];
    }

    // Method to find the sum of the factors using factors array
    public static int findSumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find the product of the factors using factors array
    public static int findProductOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find the product of cube of the factors using the factors array
    public static double findProductOfCubes(int[] factors) {
        double product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    // Method to check if a number is a perfect number
    public static boolean isPerfectNumber(int number) {
        int[] factors = findFactors(number);
        int sumOfFactors = findSumOfFactors(factors) - number; // Excluding the number itself
        return sumOfFactors == number;
    }

    // Method to check if a number is an abundant number
    public static boolean isAbundantNumber(int number) {
        int[] factors = findFactors(number);
        int sumOfFactors = findSumOfFactors(factors) - number; // Excluding the number itself
        return sumOfFactors > number;
    }

    // Method to check if a number is a deficient number
    public static boolean isDeficientNumber(int number) {
        int[] factors = findFactors(number);
        int sumOfFactors = findSumOfFactors(factors) - number; // Excluding the number itself
        return sumOfFactors < number;
    }

    // Method to check if a number is a strong number
    public static boolean isStrongNumber(int number) {
        int sum = 0;
        int temp = number;

        // Sum the factorial of each digit
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }

        return sum == number;
    }

    // Helper method to calculate factorial of a number
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int number = 145;

        // Finding factors of the number
        int[] factors = findFactors(number);
        
        // Displaying results for each method
        System.out.println("Factors of " + number + ": ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        System.out.println("Greatest Factor: " + findGreatestFactor(factors));
        System.out.println("Sum of Factors: " + findSumOfFactors(factors));
        System.out.println("Product of Factors: " + findProductOfFactors(factors));
        System.out.println("Product of Cubes of Factors: " + findProductOfCubes(factors));

        System.out.println("Is Perfect Number: " + isPerfectNumber(number));
        System.out.println("Is Abundant Number: " + isAbundantNumber(number));
        System.out.println("Is Deficient Number: " + isDeficientNumber(number));
        System.out.println("Is Strong Number: " + isStrongNumber(number));
    }
}
