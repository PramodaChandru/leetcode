package array;

import java.util.Arrays;

/**
 1657. Determine if Two Strings Are Close

 Given:
 Operation:
 1. Swap any two existing character
 2. Transform every occurrence of a character
 We can these operations as many times as necessary

 2 Strings are given(lower case english letters)

 Approach:
 Get the count of each character in str1 and str2
 Get the occurrence of each character in the str1 and str2
 Compare the count and occurrence
 */

class DetermineIfTwoStringsAreClose {
    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) return false;

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for (char ch : word1.toCharArray()) {
            freq1[ch - 'a']++;
        }

        for (char ch : word2.toCharArray()) {
            freq2[ch - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if ((freq1[i] != 0 && freq2[i] == 0) || (freq1[i] == 0 && freq2[i] != 0)) {
                return false;
            }
        }

        Arrays.sort(freq1);
        Arrays.sort(freq2);

        for(int i=0; i<26; i++) {
            if(freq1[i] != freq2[i]) {
                return false;
            }
        }
        return true;
    }
}