package array;

import java.util.HashMap;

public class MaxNumberofKSumPairs {
    private static int maxOperations(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int count=0;
        for (int num : nums) {
            if (map.containsKey(k - num) && map.get(k - num) > 0) {
                count++;
                map.put(k - num, map.get(k - num) - 1);
            } else {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(maxOperations(new int[]{3,1,3,4,3,3,3}, 6));
    }
}
