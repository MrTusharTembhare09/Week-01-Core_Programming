// Program 9: Discounted Fee with User Input
public class DiscountFeeCalculatorInput {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        // Take user input for fee and discount percentage
        System.out.print("Enter the fee amount: ");
        double fee = input.nextDouble();
        System.out.print("Enter the discount percentage: ");
        double discountPercent = input.nextDouble();
        // Calculate discount and discounted fee
        double discount = (fee * discountPercent) / 100.0;
        double discountedFee = fee - discount;
        // Print the result
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + discountedFee);
    }
}