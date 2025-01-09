// Program 6: Calculate Discounted Fee
public class DiscountedFee {
    public static void main(String[] args) {
        // Define fee and discount percentage
        int fee = 125000;
        int discountPercent = 10;

        // Calculate discount and final fee
        double discount = (fee * discountPercent) / 100.0;
        double discountedFee = fee - discount;

        // Print the results
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + discountedFee);
    }
}