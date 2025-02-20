package array;

import java.util.*;

public class FindTheDifferenceOfTwoArrays {
    private static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();

        for(int num : nums1){ s1.add(num); }
        for(int num : nums2){ s2.add(num); }

        List<List<Integer>> resultList = new ArrayList<>();
        resultList.add(new ArrayList<>());
        resultList.add(new ArrayList<>());

        for(int num : s1){
            if(!s2.contains(num)){ resultList.get(0).add(num); }
        }
        for(int num : s2){
            if(!s1.contains(num)){ resultList.get(1).add(num); }
        }

        return resultList;
    }

    public static void main(String[] args) {
        List<List<Integer>> result = findDifference(new int[]{1,2,3}, new int[]{2,4,6});

    }
}
