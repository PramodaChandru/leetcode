public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isNumberPalindrome(121));
    }

    private static boolean isNumberPalindrome(int n) {
        if(n < 0) {
            return false;
        }
        int rev_n = 0;
        int temp = n;

        while(temp != 0) {
            int digit = (int) temp % 10;
            rev_n = rev_n * 10 + digit;
            temp = temp / 10;
        }

        return n == rev_n;
    }
}
