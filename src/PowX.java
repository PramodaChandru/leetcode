/**
 * 50. POW(x, n)
 * Reference
 Define the myPow function that takes two parameters: x (the base) and n (the exponent). The function returns the value of x raised to the power of n.

 Define a helper function calc_power(x, n) that will be used for the recursive calculation. This function takes two parameters: x (the base) and n (the exponent).

 In the calc_power function:

 Check the base case: If x is 0, return 0 (as anything raised to the power of 0 is 1).
 Check another base case: If n is 0, return 1 (as anything raised to the power of 0 is 1).
 If n is even, recursively calculate res by calling calc_power(x, n // 2) and then square res (res = res * res).
 If n is odd, recursively calculate res by calling calc_power(x, (n - 1) // 2) and then square res, finally multiply it with x (res = res * res * x).
 Now, in the myPow function:

 Get the absolute value of n using abs(n) and store it in a variable abs_n.
 Calculate ans by calling calc_power(x, abs_n), which gives us the value of x raised to the power of abs_n.
 If n is non-negative (n >= 0), return ans.

 If n is negative (n < 0), return 1 / ans (which gives us the result of x raised to the power of -n, i.e., the reciprocal).
 */
class PowX {
    public double myPow(double x, int n) {
        return binaryExp(x, (long) n);
    }

    private double binaryExp(double x, long n) {
        if (n == 0) {
            return 1;
        }

        if (n < 0) {
            return 1.0 / binaryExp(x, -n);
        }

        if (n % 2 == 1) {
            return x * binaryExp(x * x, (n - 1) / 2);
        } else {
            return binaryExp(x * x, n / 2);
        }
    }

    public static void main(String[] args) {
        PowX powx = new PowX();
        System.out.println(powx.myPow(3, 4));
    }
}
