/**
 * 189. Rotate Array
 * Approach
 * First, it calculates the effective rotation amount by taking the modulus of k with the length of the array, ensuring that k is within the range of the array length.
 * Then, it calls the reverse function three times:
 * First, it reverses the entire array, effectively placing the last k elements at the start of the array.
 * Second, it reverses the first k elements, moving them to the end of the array.
 * Finally, it reverses the remaining elements, restoring the original order of the array with the elements rotated to the right by k steps.
 * Complexity
 * Time complexity: O(n)
 * Space complexity: O(1)
 */
class RotateArray {
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
    }

    public void reverse(int[] nums, int start, int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        RotateArray ra = new RotateArray();
        int arr[] = new int[6];
        int j = 0;
        for(int i : new int[]{2,5,6,1,7,8}) {
            arr[j] = i;
            j++;
        }

        ra.rotate(arr, 2);
        for(int i : arr) {
            System.out.print(i + " ");
        }
    }
}