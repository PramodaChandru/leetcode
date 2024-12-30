package prfixSum;

/**
 * 1732. Find the Highest Altitude
 1. Given array of gain, we have to find the highest altitude of a point
 2. Each element of gain array has the sum of its previous elements
 i. which is (i - 1) + i.
 3. We have to find all the altitudes and store it in array to find the max point
 4. While storing the elements we can keep the current max in a variable

 Time complexity:
 1. Iterating through each of the elements of the array at least once hence it is O(n).

 Space complexity:
 1. O(1).
 */

class FindTheHighestAltitude {
    public static void main(String[] args) {
        System.out.println(largestAltitude(new int[]{-5, 1, 5, 0, -7}));
    }
    private static int largestAltitude(int[] gain) {
        int maxValue = 0;
        int arr[] = new int[gain.length + 1];
//        int alt = 0;
//        for(int n : gain) {
//            alt += n;
//            maxValue = Math.max(maxValue, alt);
//        }
        return maxValue;
    }
}
