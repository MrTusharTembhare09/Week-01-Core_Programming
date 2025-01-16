import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class TimeZones {

    public static void main(String[] args) {
        // Creating a DateTimeFormatter to display the time in a readable format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");

        // Adding current time in GMT (Greenwich Mean Time)
        ZonedDateTime currentTimeGMT = ZonedDateTime.now(ZoneId.of("GMT"));
        System.out.println("Current time in GMT: " + currentTimeGMT.format(formatter));

        // Adding current time in IST (Indian Standard Time)
        ZonedDateTime currentTimeIST = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("Current time in IST: " + currentTimeIST.format(formatter));

        // Adding current time in PST (Pacific Standard Time)
        ZonedDateTime currentTimePST = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println("Current time in PST: " + currentTimePST.format(formatter));
    }
}
