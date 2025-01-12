// Program 6: Spring Season Check
import java.util.Scanner;

public class SpringSeason06 {

    // Method to check spring season
    public static boolean checkSpringSeason(int month, int day) {
        if((month == 3 && day >= 20) || (month > 3 && month < 6) || (month == 6 && day <= 20)) {
            return true;
        }
        return false;
    }
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for month and day
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter day (1-31): ");
        int day = sc.nextInt();

        // Checking if it's spring season
        boolean isSpring = checkSpringSeason(month, day);

        // Displaying the result
        if(isSpring) {
            System.out.println("It's a Spring Season.");
        } else {
            System.out.println("Not a Spring Season.");
        }
    }
}