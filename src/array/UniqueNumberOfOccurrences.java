package array;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class UniqueNumberOfOccurrences {
    private static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> countOccurrence = new LinkedHashMap<>();

        for(int num : arr) {
            countOccurrence.put(num, countOccurrence.getOrDefault(num, 0) + 1);
        }

        Set<Integer> resultSet = new HashSet<>(countOccurrence.values());

        return countOccurrence.size() == resultSet.size();
    }

    public static void main(String[] args) {
        System.out.println(uniqueOccurrences(new int[]{1, 2, 2, 1, 1, 3}));
        System.out.println(uniqueOccurrences(new int[]{1, 2}));
        System.out.println(uniqueOccurrences(new int[]{-3,0,1,-3,1,1,1,-3,10,0}));
    }
}
