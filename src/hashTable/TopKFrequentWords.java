package hashTable;

import java.util.*;

/**
 692. Top K Frequent Words

 Approach:
 1. words and count
 2. Get the top k using count
 3. If more than 1 key have same count then we need to sort them by lexicographical order
 */

class TopKFrequentWords {
    private static List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>();

        for(int i = 0; i < words.length; i++) {
            map.put(words[i], map.getOrDefault(words[i], 0) + 1);
        }

        List<String> result = new ArrayList<>(map.keySet());

        Collections.sort(result, (w1, w2) -> map.get(w1).equals(map.get(w2)) ?
                w1.compareTo(w2) : map.get(w2) - map.get(w1));

        return result.subList(0, k);
    }

    public static void main(String[] args) {
        System.out.println(topKFrequent(new String[]{"i", "love", "leetcode", "i", "love", "coding"}, 2));
        System.out.println(topKFrequent(new String[]{"the","day","is","sunny","the","the","the","sunny","is","is"}, 3));

    }
}