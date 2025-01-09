import java.util.Scanner;

public class EricTravels {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Input: User's name and cities involved in the travel
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter the city you are traveling from: ");
        String fromCity = sc.nextLine();

        System.out.print("Enter the city you are traveling via: ");
        String viaCity = sc.nextLine();

        System.out.print("Enter the city you are traveling to: ");
        String toCity = sc.nextLine();

        // Input: Distances between the cities
        System.out.print("Enter the distance from " + fromCity + " to " + viaCity + " in kilometers: ");
        double distanceFromToVia = sc.nextDouble();

        System.out.print("Enter the distance from " + viaCity + " to " + toCity + " in kilometers: ");
        double distanceViaToFinalCity = sc.nextDouble();

        // Input: Time taken for each segment of the journey (in hours and minutes)
        System.out.print("Enter the time taken (hours) from " + fromCity + " to " + viaCity + ": ");
        int hoursFromToVia = sc.nextInt();
        System.out.print("Enter the minutes taken from " + fromCity + " to " + viaCity + ": ");
        int minutesFromToVia = sc.nextInt();

        System.out.print("Enter the time taken (hours) from " + viaCity + " to " + toCity + ": ");
        int hoursViaToFinalCity = sc.nextInt();
        System.out.print("Enter the minutes taken from " + viaCity + " to " + toCity + ": ");
        int minutesViaToFinalCity = sc.nextInt();

        // Calculate total distance by adding both distances
        double totalDistance = distanceFromToVia + distanceViaToFinalCity;

        // Convert total time to minutes and then to hours and minutes
        int totalMinutes = (hoursFromToVia * 60 + minutesFromToVia) + (hoursViaToFinalCity * 60 + minutesViaToFinalCity);
        int totalHours = totalMinutes / 60; // Hours
        int remainingMinutes = totalMinutes % 60; // Remaining Minutes

        // Display the result
        System.out.println("\nTravel Details for " + name + ":");
        System.out.println("From: " + fromCity + " -> Via: " + viaCity + " -> To: " + toCity);
        System.out.println("Total Distance: " + totalDistance + " kilometers");
        System.out.println("Total Time: " + totalHours + " hours and " + remainingMinutes + " minutes");
    }
}
