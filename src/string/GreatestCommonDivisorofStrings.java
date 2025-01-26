package string;

/**
 * 1071. Greatest Common Divisor of Strings
 * Time complexity: O(N) - N and M are the length of str1 and str2
 * Space complexity: O(N) - N and M are the length of str1 and str2
 */
public class GreatestCommonDivisorofStrings {
    private static String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1)) return "";
        int gcd = getGcd(str1.length(), str2.length());
        return str1.substring(0, gcd);
    }

    private static int getGcd(int a, int b) {
        if (b==0) return a;
        return getGcd(b,a%b);
    }

    public static void main(String[] args) {
        String result = GreatestCommonDivisorofStrings.gcdOfStrings("ABCABC", "ABC");
        System.out.println(result);
    }
}
