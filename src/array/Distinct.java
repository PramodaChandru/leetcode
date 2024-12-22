package array;

import java.util.HashMap;
import java.util.Map;

public class Distinct {
    public static String kthDistinct(String[] arr, int k) {
        Map<String, Boolean> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], false);

            } else {
                map.put(arr[i], true);
            }
        }

        for (String item : arr) {
            if (map.get(item)) {
                count++;
                if (count == k) {
                    return item;
                }
            }
        }
        return "";
    }

    public static void main(String[] args) {
        System.out.println(kthDistinct(new String[]{"d","b","c","b","c","a"}, 2));
        System.out.println(kthDistinct(new String[]{"aaa","aa","a"}, 1));
        System.out.println(kthDistinct(new String[]{"a","b","a"}, 3));
    }
}
