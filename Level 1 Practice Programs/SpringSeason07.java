import java.util.Scanner;

public class SpringSeason07  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking month and day as input
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter day (1-31): ");
        int day = scanner.nextInt();
        
        // Checking if it's spring season (March 20 to June 20)
        if ((month > 3 || (month == 3 && day >= 20)) && (month < 6 || (month == 6 && day <= 20))) {
            System.out.println("It's a Spring Season.");
        } else {
            System.out.println("Not a Spring Season.");
        }
    }
}