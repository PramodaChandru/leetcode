/**
 * 136. Single Number
 * 2 ^ 2 = 0
 * so , X = 1 ^ 0 ^ 0
 * X = 1 ( for any , value ^ 0 = value )
 */
public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 2, 1};
        SingleNumber sn = new SingleNumber();
        int result = sn.findSingleNumber(nums);
        System.out.println("result " + (result == 1));
    }

    public int findSingleNumber(int nums[]) {
        int val = 0;
        for(int num : nums) {
            val = val ^ num;
        }
        return val;
    }
}
