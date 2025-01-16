import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateComparison {

    public static void main(String[] args) {
        // Creating a DateTimeFormatter to parse the input dates
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // Taking the first date input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first date (yyyy-MM-dd): ");
        String inputDate1 = scanner.nextLine();

        // Taking the second date input from the user
        System.out.print("Enter the second date (yyyy-MM-dd): ");
        String inputDate2 = scanner.nextLine();

        // Parsing the input dates to LocalDate
        LocalDate date1 = LocalDate.parse(inputDate1, formatter);
        LocalDate date2 = LocalDate.parse(inputDate2, formatter);

        // Comparing the two dates
        if (date1.isBefore(date2)) {
            System.out.println("The first date is before the second date.");
        } else if (date1.isAfter(date2)) {
            System.out.println("The first date is after the second date.");
        } else if (date1.isEqual(date2)) {
            System.out.println("The first date is the same as the second date.");
        }
    }
}
