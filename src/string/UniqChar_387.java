package string;

import java.util.Scanner;

public class UniqChar_387 {
    public static int firstUniqChar(String s) {
        int result = Integer.MAX_VALUE;
        for(char c = 'a'; c <= 'z'; c++) {
            int index = s.indexOf(c);
            if(index != -1 && index == s.lastIndexOf(c)) {
                result = Math.min(result, index);
            }
        }
        return result == Integer.MAX_VALUE ? -1 : result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();
        System.out.println(firstUniqChar(s));

        System.out.println("IntersectionOfTwoArrays 1 result ====> " + test("leet", 0));
        System.out.println("IntersectionOfTwoArrays 2 result ====> " + test("leel", -1));
    }

    public static boolean test(String input, int output) {
        return firstUniqChar(input) == output;
    }
}
