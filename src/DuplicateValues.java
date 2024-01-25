public class DuplicateValues {
    public static void main(String []args){
        int[] nums = new int[]{1,1,2};
        removeDup(nums);

    }

    public static void removeDup(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                count++;
            } else {
                nums[i + 1 - count] = nums[i + 1];
            }
        }
        //nums[nums.length - 1] = nums[nums.length - 1];
        System.out.println(nums.length - count);
    }
}
