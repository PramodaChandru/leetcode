package BinaryTree; /**
 * 222. Count Complete Tree Nodes
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
 Complexity:

 Time complexity: O(n) - all the nodes are visited once
 Space Complexity: O(logn) (due to the depth of the recursion stack being the height of the tree)
 */
class CountNodes {
    public int countNodes(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int cl = countNodes(root.left);
        int cr = countNodes(root.right);
        return cl + cr + 1;
    }

    public static void main(String[] args) {
        CountNodes cn = new CountNodes();
        TreeNode root = new TreeNode(2);
        TreeNode rootLeft = new TreeNode(3);
        root.left = rootLeft;

        System.out.println(cn.countNodes(root));
    }

}