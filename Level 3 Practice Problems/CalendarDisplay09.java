import java.util.Scanner;

public class CalendarDisplay09 {

    // Method to get the name of the month based on the month number
    public static String getMonthName(int month) {
        String[] months = {
            "January", "February", "March", "April", "May", "June", 
            "July", "August", "September", "October", "November", "December"
        };
        return months[month - 1];
    }

    // Method to get the number of days in a month
    public static int getNumberOfDaysInMonth(int month, int year) {
        int[] daysInMonth = {
            31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
        };
        
        // For February, check if it's a leap year
        if (month == 2 && isLeapYear(year)) {
            return 29; // Leap year
        }
        
        return daysInMonth[month - 1]; // Return the days for the given month
    }

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to get the first day of the month (0: Sunday, 1: Monday, ..., 6: Saturday)
    public static int getFirstDayOfMonth(int month, int year) {
        int y = year;
        int m = month;

        if (m == 1 || m == 2) {
            m += 12;
            y--;
        }

        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (1 + x + 31 * m0 / 12) % 7;

        return d0; // Return the first day of the month (0-6)
    }

    // Method to display the calendar
    public static void displayCalendar(int month, int year) {
        // Get the name of the month
        String monthName = getMonthName(month);
        
        // Get the number of days in the month
        int numberOfDays = getNumberOfDaysInMonth(month, year);
        
        // Get the first day of the month
        int firstDay = getFirstDayOfMonth(month, year);
        
        // Display the month and year
        System.out.println("\nCalendar for " + monthName + " " + year);
        
        // Display the headers (Sun, Mon, Tue, ..., Sat)
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        
        // Indentation for the first row based on the first day of the month
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    "); // 4 spaces for each day
        }
        
        // Display the days of the month
        for (int day = 1; day <= numberOfDays; day++) {
            System.out.printf("%3d ", day);
            if ((firstDay + day) % 7 == 0) {
                System.out.println(); // Move to the next line after Saturday
            }
        }
        
        System.out.println(); // Move to the next line after printing the calendar
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for month and year
        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter the year: ");
        int year = scanner.nextInt();

        // Call the method to display the calendar
        displayCalendar(month, year);
        
        // Closing the scanner
        scanner.close();
    }
}
