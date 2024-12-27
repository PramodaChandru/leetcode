package tree;

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

/**
 1448. Count Good Nodes in Binary Tree

 Complexity:
 Time Complexity	- O(n) - Each node is visited exactly once.
 Space Complexity - O(h), where h ≤ n - Recursion stack depends on the height of the tree
 */

class CountGoodNodesInBinaryTree {
    public static int goodNodes(TreeNode root) {
        return goodNodesHelper(root, root.val);
    }

    public static int goodNodesHelper(TreeNode root, int maxValue) {
        if(root == null) {
            return 0;
        }

        int result = 0;
        if(root.val >= maxValue) {
            result = 1;
            maxValue = root.val;
        }

        result += goodNodesHelper(root.left, maxValue);
        result += goodNodesHelper(root.right, maxValue);

        return result;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode left1 = new TreeNode(3);
        TreeNode left1_left = new TreeNode(4);
        TreeNode left1_right = new TreeNode(5);
        root.left = left1;
        left1.left = left1_left;
        left1.right = left1_right;
        System.out.println(goodNodes(root));
    }
}
