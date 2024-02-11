public class Sqrt {
    public static int mySqrt(int x) {
        if ( x == 0 || x == 1) {
            return x;
        }
        int start = 1;
        int end = x;
        int mid = -1;
        while ( start <= end) {
            mid = start + (end - start) / 2;
            if ((long)mid * mid > (long)x) {
                end = mid - 1;
            } else if (mid * mid == x) {
                return mid;
            } else {
                start = mid + 1;
            }
        }
        return end;
    }

    public static int mySqrt1(int x) {
        long r = x;
        while (r * r > x) {
            r = (r + x / r) / 2;
        }
        return (int) r;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(213456));
        System.out.println(mySqrt1(213456));
    }
}
