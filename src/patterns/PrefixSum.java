package patterns;

import Utility.ArrayUtility;

/**
 * 1. Create a new array with sum of current array index value and the previous values from new array
 * 2. prefixArray = p[i - 1] + arr[i]
 * 3. Time complexity: O(n + q) - n : to compute prefix array, q - query to be performed
 * 4. Space Complexity: O(n) - n : number of prefix array elements
 */
public class PrefixSum {

    private static int[] computePrefixArray(int[] arr) {
        int[] prefixArr = new int[arr.length];
        prefixArr[0] = arr[0];
        for(int i = 1; i < arr.length; i++) {
            prefixArr[i] = prefixArr[i - 1] + arr[i];
        }
        return prefixArr;
    }
    public static void main(String[] args) {
        int[] arr = ArrayUtility.sampleArray(5);
        int[] resultArr = computePrefixArray(arr);
        ArrayUtility.printArray(resultArr);
    }
}
