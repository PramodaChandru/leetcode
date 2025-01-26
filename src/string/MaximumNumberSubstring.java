package string;

/**
 1456. Maximum Number of Vowels in a Substring of Given Length

 Approach:
 1. Use sliding window pattern
 2. Intialize maxVCount to 0
 3. Count the number of vowels for the first k chars in the string
 4. loop through k to s.length chars in the string
 5. Remove the begining chars from the window and update the currCount
 6. Add the window + 1 char and update the currCount
 7. Get the max of currCount and maxCount
 8. return the vowelCount

 Complexity:
 Time Complexity: O(n) - Each character is visited once.

 Space Complexity: O(1) - No additional data structures are used.
 */

class MaximumNumberSubstring {
    public int maxVowels(String s, int k) {
        int maxVowelCount = 0;
        int count = 0;
        for(int i = 0; i < k; i++) {
            if(isVowel(s.charAt(i))) {
                count++;
            }
        }
        maxVowelCount = count;

        for(int i = k; i < s.length(); i++) {
            if(isVowel(s.charAt(i - k))) {
                count--;
            }

            if(isVowel(s.charAt(i))) {
                count++;
            }
            maxVowelCount = Math.max(maxVowelCount, count);
        }

        return maxVowelCount;
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public static void main(String[] args) {
        MaximumNumberSubstring mns = new MaximumNumberSubstring();
        System.out.println(mns.maxVowels("leetcode", 3));
    }
}