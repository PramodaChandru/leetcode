public class RemoveElement_27 {
    public static int removeElement(int[] nums, int val) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        int nums[] = {2, 3, 2, 3};
        int expectedNums[] = {2,2};
        int count = removeElement(nums, 3);
        for (int i = 0; i < expectedNums.length; i++) {
            if(nums[i] != expectedNums[i]) {
                System.out.println("Return false");
            }
        }
        System.out.println("All done");
    }
}
