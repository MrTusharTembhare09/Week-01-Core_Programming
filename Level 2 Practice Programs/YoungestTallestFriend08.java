import java.util.Scanner;

public class YoungestTallestFriend08  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Take input for the age and height of Amar
        System.out.print("Enter the age and height (in cm) of Amar: ");
        int ageAmar = scanner.nextInt();
        int heightAmar = scanner.nextInt();
        
        // Take input for the age and height of Akbar
        System.out.print("Enter the age and height (in cm) of Akbar: ");
        int ageAkbar = scanner.nextInt();
        int heightAkbar = scanner.nextInt();
        
        // Take input for the age and height of Anthony
        System.out.print("Enter the age and height (in cm) of Anthony: ");
        int ageAnthony = scanner.nextInt();
        int heightAnthony = scanner.nextInt();
        
        // Find the youngest friend (minimum age)
        int youngestAge = Math.min(ageAmar, Math.min(ageAkbar, ageAnthony));
        String youngestFriend = "";
        
        if (youngestAge == ageAmar) {
            youngestFriend = "Amar";
        } else if (youngestAge == ageAkbar) {
            youngestFriend = "Akbar";
        } else {
            youngestFriend = "Anthony";
        }
        
        // Find the tallest friend (maximum height)
        int tallestHeight = Math.max(heightAmar, Math.max(heightAkbar, heightAnthony));
        String tallestFriend = "";
        
        if (tallestHeight == heightAmar) {
            tallestFriend = "Amar";
        } else if (tallestHeight == heightAkbar) {
            tallestFriend = "Akbar";
        } else {
            tallestFriend = "Anthony";
        }
        
        // Display the results
        System.out.println("The youngest friend is: " + youngestFriend);
        System.out.println("The tallest friend is: " + tallestFriend);
    }
}