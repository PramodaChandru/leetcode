package Utility;

public class ArrayUtility {
    private static int[] sampleArr;
    public static void printArray(int[] arr) {
        System.out.print("original Array ====> ");
        for(int i : sampleArr) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
        System.out.print("result Array ====> ");
        for(int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static int[] sampleArray(int n) {
        sampleArr = new int[n];
        for(int i = 0; i < n; i++) {
            sampleArr[i] = i + 1;
        }
        return sampleArr;
    }
}
