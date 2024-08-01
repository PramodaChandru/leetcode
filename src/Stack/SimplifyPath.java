package Stack;

import java.util.Stack;

/**
 * 71. Simplify Path
 * Complexity:
 * Time Complexity: O(n) - where n is the length of the input path. Each character is processed once during splitting and then each component is processed once while iterating.

 * Space Complexity:
 * O(n) in the worst case, where all the components are valid directories and stored in the stack
 */
class SimplifyPath {
    public String simplifyPath(String path) {
        String[] str = path.split("/");
        Stack<String> st = new Stack<>();
        for(String s: str) {
            if(s.equals("..")) {
                if(!st.isEmpty()) {
                    st.pop();
                }
            } else if(!s.equals(".") && !s.equals("")){
                st.push(s);
            }
        }
        if(st.isEmpty()) return "/";
        StringBuilder sb = new StringBuilder();
        for(String s: st) {
            sb.append("/").append(s);
        }
        return sb.length() > 0 ? sb.toString() : "/";
    }

    public static void main(String[] args) {
        SimplifyPath sp = new SimplifyPath();
        System.out.println(sp.simplifyPath("\"/home/user/Documents/../Pictures\""));
    }
}