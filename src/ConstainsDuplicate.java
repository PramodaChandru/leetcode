import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ConstainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                return true;
            } else {
                map.put(nums[i], 1);
            }
        }
        return false;
    }

    public boolean checkForDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length - 1; i++) {
            if(nums[i] == nums[i - 1]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int nums1[] = {1,2,2,3};
        int nums2[] = {1,2,3,4};
        ConstainsDuplicate cd = new ConstainsDuplicate();
        System.out.println(cd.containsDuplicate(nums1));
        System.out.println(cd.containsDuplicate(nums2));

        System.out.println(cd.checkForDuplicate(nums1));
        System.out.println(cd.checkForDuplicate(nums2));
    }
}
