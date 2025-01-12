import java.util.*;

public class FactorCalculations01 {

    // Method to find factors
    public static int[] findFactors(int num) {
        ArrayList<Integer> factorList = new ArrayList<>();
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factorList.add(i);  // Store factor in list
            }
        }
        int[] factors = new int[factorList.size()];
        for (int i = 0; i < factorList.size(); i++) {
            factors[i] = factorList.get(i);  // Convert list to array
        }
        return factors;
    }
	
	// Method to calculate sum of factors
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;  // Add factor to sum
        }
        return sum;
    }
	
	// Method to calculate sum of squares of factors
    public static int sumOfSquares(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += Math.pow(factor, 2);  // Add square of factor to sum
        }
        return sum;
    }
	
	// Method to calculate product of factors
    public static int productOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;  // Multiply factor to product
        }
        return product;
    }
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        // Step 2: Finding factors and store in array
        int[] factors = findFactors(num);
        
        // Step 3: Calculating and displaying sum, sum of squares, and product of factors
        System.out.println("Factors: " + Arrays.toString(factors));
        System.out.println("Sum of factors: " + sumOfFactors(factors));
        System.out.println("Sum of squares of factors: " + sumOfSquares(factors));
        System.out.println("Product of factors: " + productOfFactors(factors));
    }
}
