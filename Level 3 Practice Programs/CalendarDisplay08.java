import java.util.Scanner;

public class CalendarDisplay08 {

    // Method to get the name of the month
    public static String getMonthName(int month) {
        String[] months = {
            "January", "February", "March", "April", "May", "June", 
            "July", "August", "September", "October", "November", "December"
        };
        return months[month - 1];
    }

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        // A year is a leap year if divisible by 4, except for century years divisible by 100 unless also divisible by 400
        return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
    }

    // Method to get the number of days in a given month
    public static int getDaysInMonth(int month, int year) {
        // Array of days in each month (for non-leap years)
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Checking for February in leap years
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        
        return daysInMonth[month - 1];
    }

    // Method to calculate the first day of the month using the Gregorian calendar algorithm
    public static int getFirstDayOfMonth(int month, int year) {
        int y = year;
        int m = month;
        if (m < 3) {
            m += 12;
            y -= 1;
        }
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (1 + x + (31 * m0) / 12) % 7;
        return d0; // This returns the day of the week (0=Sunday, 1=Monday, ..., 6=Saturday)
    }

    // Method to display the calendar
    public static void displayCalendar(int month, int year) {
        String monthName = getMonthName(month);
        int daysInMonth = getDaysInMonth(month, year);
        int firstDay = getFirstDayOfMonth(month, year);
        
        // Printing the calendar header
        System.out.printf("     %s %d\n", monthName, year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        
        // Printing leading spaces for the first day of the month
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }
        
        // Printing the days of the month
        int day = 1;
        for (int i = firstDay; i < 7; i++) {
            System.out.printf("%3d ", day++);
        }
        System.out.println();
        
        // Printing the rest of the days in the month
        for (int i = 2; i <= (daysInMonth + firstDay - 1) / 7 + 1; i++) {
            for (int j = 0; j < 7; j++) {
                if (day <= daysInMonth) {
                    System.out.printf("%3d ", day++);
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Getting user input for month and year
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        // Displaying the calendar for the given month and year
        displayCalendar(month, year);
    }
}
