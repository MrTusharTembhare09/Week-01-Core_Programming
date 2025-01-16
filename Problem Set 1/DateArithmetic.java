import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateArithmetic {

    public static void main(String[] args) {
        // Creating a DateTimeFormatter to parse the input date
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // Taking date input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a date (yyyy-MM-dd): ");
        String inputDate = scanner.nextLine();
        
        // Parsing the input date to LocalDate
        LocalDate date = LocalDate.parse(inputDate, formatter);

        // Adding 7 days, 1 month, and 2 years to the input date
        LocalDate updatedDate = date.plusDays(7)     // Adding 7 days
                                     .plusMonths(1)  // Adding 1 month
                                     .plusYears(2);  // Adding 2 years

        // Subtracting 3 weeks from the updated date
        updatedDate = updatedDate.minusWeeks(3); // Subtracting 3 weeks

        // Displaying the resulting date
        System.out.println("Resulting date after arithmetic: " + updatedDate);
    }
}
