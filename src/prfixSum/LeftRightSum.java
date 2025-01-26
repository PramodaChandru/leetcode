package prfixSum;

import utility.ArrayUtility;

public class LeftRightSum {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int leftSum[] = new int[n];
        leftSum[0] = 0;
        int rightSum[] = new int[n];
        rightSum[n - 1] = 0;
        int result[] = new int[n];
        for(int i = 1; i < nums.length; i++) {
            leftSum[i] = nums[i - 1] + leftSum[i - 1];
        }
        for (int i = nums.length - 2; i >= 0; i--) {
            rightSum[i] = rightSum[i + 1] + nums[i + 1];
        }
        for (int i = 0; i < nums.length; i++) {
            result[i] = Math.abs(leftSum[i] - rightSum[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        LeftRightSum lr = new LeftRightSum();
        int res[] = lr.leftRightDifference(ArrayUtility.sampleArray(4));
        ArrayUtility.printArray(res);
    }
}
