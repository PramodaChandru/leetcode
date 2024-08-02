package Utility;

public class ArrayUtility {
    public static void printArray(int[] arr) {
        System.out.print("result Array ====> ");
        for(int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static int[] sampleArray(int n) {
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }
}
