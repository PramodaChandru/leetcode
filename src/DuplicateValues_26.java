public class DuplicateValues_26 {
    public static void main(String []args){
//        int[] nums = new int[]{0, 0, 0, 1, 1, 2, 2, 3, 3, 4};
        int[] nums = new int[]{1,1,2};
        System.out.println(removeDup(nums));

    }

    public static int removeDup(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if(nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}
