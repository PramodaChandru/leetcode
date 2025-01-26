package string;

/**
 * 1768. Merge Strings Alternately
 * Time Complexity : O(N) - N is the longest length of the String
 * Space Complexity: O(M) - To store the result in String builder, M is the length of the String word1 and String word2
 */
public class MergeStringsAlternately {
    private static String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int n = Math.max(word1.length(), word2.length());
        for(int i = 0; i < n; i++) {
            if(i < word1.length()) {
                result.append(word1.charAt(i));
            }
            if(i < word2.length()) {
                result.append(word2.charAt(i));
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String result = MergeStringsAlternately.mergeAlternately("abc", "def");
        System.out.println(result);
    }
}
