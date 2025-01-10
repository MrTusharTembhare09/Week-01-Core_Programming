import java.util.*;

public class VotingEligibility01 {
    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
		int ages[] = new int[10];
		
		// Taking input for each student's age
        System.out.println("Enter the ages of 10 students:");
        for(int i = 0; i < ages.length; i++) {
            System.out.print("Student " + (i + 1) + " age: ");
            ages[i] = input.nextInt();
        }
		
		// Processing each student's age
        for(int i = 0; i < ages.length; i++) {
            if(ages[i] < 0) {
                System.out.println("Student " + (i + 1) + ": Invalid age.");
            } else if (ages[i] >= 18) {
                System.out.println("Student " + (i + 1) + " with age " + ages[i] + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " with age " + ages[i] + " cannot vote.");
            }
        }
		
		input.close();
	}
}
		
		
		