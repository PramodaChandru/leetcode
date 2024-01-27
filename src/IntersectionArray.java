public class IntersectionArray {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] resultArray;
        int[] intrArray;
        int[] newArray;
        if(nums1.length >= nums2.length) {
            resultArray = new int[nums1.length];
        } else {
            resultArray = new int[nums2.length];
        }
        int count = 0;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if(nums1[i] == nums2[j]) {
                    resultArray[count] = nums1[i];
                    count++;
                    newArray = new int[nums2.length - 1];
                    for (int k = 0, p = 0; k < nums2.length; k++) {
                        if(j == k) {
                            continue;
                        }
                        newArray[p++] = nums2[k];
                    }
                    nums2 = newArray;
                    break;
                }
            }
        }
        intrArray = new int[count];
        for (int i = 0; i < intrArray.length; i++) {
            intrArray[i] = resultArray[i];
        }
        return intrArray;
    }

    public static void main(String[] args) {
        IntersectionArray inter = new IntersectionArray();
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        int[] resultArray = inter.intersect(nums1, nums2);
        for(int i : resultArray) {
            System.out.print(i +" , ");
        }
    }
}
