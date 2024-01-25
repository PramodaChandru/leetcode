public class Sqrt {
    public static int mySqrt(int x) {
        if(x==0) return 0;
        int low = 1,high = x,ans =0;
        while(low<=high){
            int mid =low + (high-low)/2;
            if(x/mid==mid)  return mid;
            else if(x/mid<mid)   high=mid-1;
            else {low = mid+1; ans = mid;}
        }
        return ans;
    }

    public static int mySqrt1(int x) {
        long r = x;
        while (r * r > x) {
            r = (r + x/r) / 2;
        }
        return (int) r;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(9));
        System.out.println(mySqrt1(9));
    }
}
