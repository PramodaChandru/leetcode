package tree;

/**
 * Definition for a binary tree node.
 * public class BinaryTree.TreeNode {
 *     int val;
 *     BinaryTree.TreeNode left;
 *     BinaryTree.TreeNode right;
 *     BinaryTree.TreeNode() {}
 *     BinaryTree.TreeNode(int val) { this.val = val; }
 *     BinaryTree.TreeNode(int val, BinaryTree.TreeNode left, BinaryTree.TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class PathSumII {
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
        PathSumII ps = new PathSumII();
        TreeNode root = new TreeNode(2);
        TreeNode rootLeft = new TreeNode(3);
        root.left = rootLeft;
        ps.maxPathSum(root);
    }
}