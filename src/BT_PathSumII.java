/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class BT_PathSumII {
    private int maxSum;
    private int maxPathSumHelper(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftSum = Math.max(0, maxPathSumHelper(root.left));
        int rightSum = Math.max(0, maxPathSumHelper(root.right));
        maxSum = Math.max(maxSum, leftSum + rightSum + root.val);
        return Math.max(leftSum, rightSum) + root.val;
    }

    public int maxPathSum(TreeNode root) {
        maxSum = Integer.MIN_VALUE;
        maxPathSumHelper(root);
        System.out.println(maxSum);
        return maxSum;
    }

    public static void main(String[] args) {
        BT_PathSumII ps = new BT_PathSumII();
        TreeNode root = new TreeNode(2);
        TreeNode rootLeft = new TreeNode(3);
        root.left = rootLeft;
        ps.maxPathSum(root);
    }
}