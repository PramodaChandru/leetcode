package Stack;

/**
 2390. Removing Stars From a String
 Given:
 String s contains stars and lower case english letters.
 For each operation remove the * and the letter to its left

 Time Complexity: O(n) - each character is visited at most once
 Space Complexity: O(1) - No additional data structures are used
 */

import java.util.Stack;

public class RemovingStarsFromaString {
//    private static String removeStars(String s) {
//        Stack<Character> stack = new Stack<>();
//        for(int i = 0; i < s.length();i++) {
//            if(s.charAt(i) != '*') {
//                stack.push(s.charAt(i));
//            } else {
//                if(!stack.isEmpty()) {
//                    stack.pop();
//                }
//            }
//        }
//
//        StringBuilder sb = new StringBuilder();
//        for(Character c : stack) {
//            sb.append(c);
//        }
//        return sb.toString();
//    }

    private static String removeStars(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != '*') {
                sb.append(s.charAt(i));
            } else {
                sb.deleteCharAt(sb.length() - 1);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "leet**cod*e";
        System.out.println(removeStars(str));
    }
}
