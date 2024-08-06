package prfixSum;

import Utility.ArrayUtility;

/*
Complexity:
Time complexity: O(n) each element is visited alteast once.
Space Complexity: O(1) no additional data structures used.
 */
class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        int total = 0;
        for(int num : nums) {
            total += num;
        }
        int leftTotal = 0;
        for(int i = 0; i < nums.length; i++) {
            int rightTotal = total - leftTotal - nums[i];
            if(rightTotal == leftTotal) {
                return i;
            }
            leftTotal += nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        FindPivotIndex fpi = new FindPivotIndex();
        int res = fpi.pivotIndex(new int[]{1,7,3,6,5,6});
        System.out.println("index " + res);

    }
}
