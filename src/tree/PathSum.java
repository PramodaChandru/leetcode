package tree; /**
 * 112. PathSum
 *
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

/**
 Intution:
 Everytime we move down the tree targetSem will be subtracted by the root value

 Approach:
 Base case: 
 1. if root is none return false
 2. if root is leaf check value == targetSum

 1. Base condition will guaranty the exit of the recursive loop
 2. if the above conditions are not met, function hasPathSum will be recursively called
 3. The recursive call will be made on left anf right subtree which returns true 
 4. At the end check if left or right subtree returned true
 5. if none of the above cases matches return false

 Complexity:
 Time Complexity: O(n) each node will be visited atleast once in the worst case
 Space Complexity: O(n) in the worst case for skewed tree
 */
class PathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            return targetSum == root.val;
        }

        boolean left = hasPathSum(root.left, targetSum - root.val);
        boolean right = hasPathSum(root.right, targetSum - root.val);
        return left || right;
    }

    public static void main(String[] args) {
        PathSum ps = new PathSum();
        TreeNode root = new TreeNode(2);
        TreeNode rootLeft = new TreeNode(3);
        root.left = rootLeft;

        System.out.println(ps.hasPathSum(root, 4));
    }
}