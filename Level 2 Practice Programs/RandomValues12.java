import java.util.*;

public class RandomValues12 {

    // Method to generate an array of 4-digit random numbers
    public int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = (int) (Math.random() * 9000) + 1000; // Generating a 4-digit number
        }
        return numbers;
    }

    // Method to find average, min, and max values of an array
    public double[] findAverageMinMax(int[] numbers) {
        double sum = 0;
        int min = numbers[0];
        int max = numbers[0];

        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        double average = sum / numbers.length;
        return new double[]{average, min, max};
    }

    public static void main(String[] args) {
        RandomValues12 randomValues = new RandomValues12();

        // Generating 5 random 4-digit numbers
        int[] randomNumbers = randomValues.generate4DigitRandomArray(5);

        // Finding the average, minimum, and maximum values
        double[] results = randomValues.findAverageMinMax(randomNumbers);

        // Output the results
        System.out.println("Generated 4-digit numbers: ");
        for (int num : randomNumbers) {
            System.out.print(num + " ");
        }
        System.out.println("\nAverage: " + results[0]);
        System.out.println("Minimum value: " + results[1]);
        System.out.println("Maximum value: " + results[2]);
    }
}

