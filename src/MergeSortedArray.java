import java.util.Arrays;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = m; i < m + n; i++) {
            nums1[i] = nums2[i - m];
        }
        Arrays.sort(nums1);
    }

    public void merge2(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
    }

    public static void main(String[] args) {
        MergeSortedArray msa = new MergeSortedArray();
        int[] arr = {1, 2, 3, 0, 0, 0};
        msa.merge(arr, 3, new int[]{2, 5, 6}, 3);
        System.out.println("First approach : ");
        for (int n : arr) {
            System.out.print(n);
        }
        int[] arr1 = {1, 2, 3, 0, 0, 0};
        msa.merge2(arr1, 3, new int[]{2, 5, 6}, 3);
        System.out.println("\nSecond approach : ");
        for (int n : arr) {
            System.out.print(n);
        }
    }
}
