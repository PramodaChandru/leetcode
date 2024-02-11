import java.util.HashMap;
import java.util.Map;

public class SingleNumberFromArray {
    public int singleNumber_mySoln(int[] nums) {
        int num = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            if (map.containsKey(n)) {
                map.put(n, map.get(n) + 1);
            } else {
                map.put(n, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                num = entry.getKey();
            }
        }
        return num;
    }

    public int singleNumber(int[] nums) {
        int ans = 0;
        for(int i = 0 ; i < nums.length ; i++){
            ans = ans ^ nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int nums[] = {4,1,1,2,2};
        SingleNumberFromArray sl = new SingleNumberFromArray();
        System.out.println(sl.singleNumber_mySoln(nums));
        System.out.println(sl.singleNumber(nums));
    }
}
