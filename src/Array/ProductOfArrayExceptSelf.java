package Array;

import java.util.Arrays;

class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        Arrays.fill(ans, 1);
        int curr = 1;
        for(int i = 0; i < n; i++) {
            ans[i] *= curr;
            curr *= nums[i];
        }
        curr = 1;
        for(int i = n - 1; i >= 0; i--) {
            ans[i] *= curr;
            curr *= nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        ProductOfArrayExceptSelf parr = new ProductOfArrayExceptSelf();
        int[] res = parr.productExceptSelf(new int[]{1,2,6,8});
        for(int i : res) {
            System.out.println(i);
        }
    }
}
