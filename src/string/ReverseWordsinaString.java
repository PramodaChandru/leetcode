package string;

import java.util.Objects;

public class ReverseWordsinaString {
    private static String reverseWords(String s) {
        s = s.trim(); // remove the leading and trailing space
        String[] strArr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = strArr.length - 1; i >= 0; i--) {
            if(!Objects.equals(strArr[i], "")) {
                sb.append(strArr[i] + " ");
                if(i != 0) {
                    sb.append(" ");
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("Hello  World"));
    }
}
