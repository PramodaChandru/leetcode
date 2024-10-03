package Stack;

import java.util.Stack;

public class RemovingStarsFromaString {
    private static String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length();i++) {
            if(s.charAt(i) != '*') {
                stack.push(s.charAt(i));
            } else {
                if(!stack.isEmpty()) {
                    stack.pop();
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for(Character c : stack) {
            sb.append(c);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "leet**cod*e";
        System.out.println(removeStars(str));
    }
}
