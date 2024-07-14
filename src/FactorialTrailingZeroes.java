/**
 * 172.
 * Given an integer n, return the number of trailing zeroes in n!.
 * Note that n! = n * (n - 1) * (n - 2) * ... * 3 * 2 * 1.
 * Example 1:
 * Input: n = 3
 * Output: 0
 * Explanation: 3! = 6, no trailing zero.
 * A efficient way to solve this problem is to count the number of factors of 5 in the numbers from 1 to n.
 * This is because each factor of 5 paired with a factor of 2 produces a trailing zero,
 * and there are generally more factors of 2 than 5.
 */
public class FactorialTrailingZeroes {
    public int trailingZeroes(int n) {
            int res = 0;
            while (n > 0) {
                n = n / 5;
                res = res + n;
            }
            return res;
    }

    public static void main(String[] args) {
        FactorialTrailingZeroes ftz = new FactorialTrailingZeroes();
        System.out.println(ftz.trailingZeroes(3));
        System.out.println(ftz.trailingZeroes(5));
    }
}
