import java.util.Scanner;

public class PurchasePriceCalculator {

    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Input: unit price and quantity of the item
        System.out.print("Enter the unit price of the item (INR): ");
        double unitPrice = sc.nextDouble();

        System.out.print("Enter the quantity of the item: ");
        int quantity = sc.nextInt();

        // Calculate the total purchase price
        double totalPrice = unitPrice * quantity;

        // Output the total price, quantity, and unit price
        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity is " + quantity + " and unit price is INR " + unitPrice + ".");
    }
}
