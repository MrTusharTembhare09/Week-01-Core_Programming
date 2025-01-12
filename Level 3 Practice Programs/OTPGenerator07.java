import java.util.HashSet;

public class OTPGenerator07 {

    // Method to generate a 6-digit OTP number using Math.random()
    public static int generateOTP() {
        return (int) (Math.random() * 900000) + 100000;  // Generates a random 6-digit number
    }

    // Method to ensure OTP numbers are unique
    public static boolean areUniqueOTPs(int[] OTPs) {
        HashSet<Integer> otpSet = new HashSet<>();
        
        // Adding all OTPs to a set, since a set does not allow duplicates
        for (int otp : OTPs) {
            otpSet.add(otp);
        }
        
        // If the size of the set is equal to the array size, it means all OTPs are unique
        return otpSet.size() == otps.length;
    }

    public static void main(String[] args) {
        int[] OTPs = new int[10];  // Array to store 10 OTPs

        // Generating 10 OTPs and store them in the array
        for (int i = 0; i < 10; i++) {
            OTPs[i] = generateOTP();
            System.out.println("Generated OTP #" + (i + 1) + ": " + otps[i]);
        }

        // Checking if all the generated OTPs are unique
        if (areUniqueOTPs(OTPs)) {
            System.out.println("\nAll OTPs are unique.");
        } else {
            System.out.println("\nSome OTPs are not unique.");
        }
    }
}
