// Program 4: Calculate Profit and Loss
public class ProfitAndLoss {
    public static void main(String[] args) {
        // Define cost price and selling price
        int costPrice = 129;
        int sellingPrice = 191;

        // Calculate profit and profit percentage
        int profit = sellingPrice - costPrice;
        double profitPercentage = (profit / (double) costPrice) * 100;

        // Print the results
        System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice + "\n" +
                           "The Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage);
    }
}