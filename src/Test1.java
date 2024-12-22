import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        System.out.println(Test1.largestAltitude(new int[]{-4,-3,-2,-1,4,3,2}));
    }

    public static int largestAltitude(int[] gain) {
        int[] alt = new int[gain.length + 1];
        alt[0] = 0; // Initial altitude is 0
        int maxAlt = 0; // Start with the minimum possible value

        for (int i = 0; i < gain.length; i++) {
            alt[i + 1] = alt[i] + gain[i]; // Update altitude at i + 1
            maxAlt = Math.max(maxAlt, alt[i + 1]); // Compare with updated altitude
        }

        return maxAlt; // Return the highest altitude
    }

}
