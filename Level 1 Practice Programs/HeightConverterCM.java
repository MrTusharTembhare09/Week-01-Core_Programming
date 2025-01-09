// Program 10: Convert Height from CM to Feet and Inches
public class HeightConverterCM {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        // Take user input for height in cm
        System.out.print("Enter your height in centimeters: ");
        double heightCm = input.nextDouble();
        // Conversion factors
        double heightInches = heightCm / 2.54;
        int feet = (int) (heightInches / 12);
        double remainingInches = heightInches % 12;
        // Print the result
        System.out.println("Your Height in cm is " + heightCm + " while in feet is " + feet + " and inches is " + remainingInches);
    }
}