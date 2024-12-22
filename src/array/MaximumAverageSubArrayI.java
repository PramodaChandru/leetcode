package array;

/**
 643. Maximum Average Subarray I
 Time Complexity:
 O(n) because we iterate through the array once.

 Space Complexity:
 O(1) since no additional space is used beyond a few variables.
 */
public class MaximumAverageSubArrayI {
    public static void main(String[] args) {
        System.out.println(findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4));
    }
    private static double findMaxAverage(int[] nums, int k) {
        int currentSum = 0;
        for (int i = 0; i < k; i++) {
            currentSum += nums[i];
        }

        int maxSum = currentSum;

        for (int i = k; i < nums.length; i++) {
            currentSum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, currentSum);
        }
        return (double) maxSum / k;
    }
}