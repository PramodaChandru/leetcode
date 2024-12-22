package array;

import java.util.*;

public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1 == null || nums2 == null) {
            return new int[0];
        }

        final List<Integer> result = new ArrayList<>();
        final Set<Integer> set = new HashSet<>();
        for (int num : nums1) {
            set.add(num);
        }

        for (int num : nums2) {
            if (set.contains(num)) {
                result.add(num);
                set.remove(num);
            }
        }

        return result.stream().mapToInt(number -> number).toArray();
    }
}
