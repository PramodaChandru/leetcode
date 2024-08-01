package BinaryTree;

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
class SumRootLeaf {

    int sum=0;
    public int sumNumbers(TreeNode root) {
        helper(root,"");
        return sum;
    }
    public void helper(TreeNode root, String str){
        if(root==null){
            return;
        }
        str+=root.val;
        if(root.left==null && root.right==null){
            sum+=Integer.parseInt(str);
            return;
        }
        helper(root.left,str);
        helper(root.right,str);
    }

    public static void main(String[] args) {
        PathSumII ps = new PathSumII();
        TreeNode root = new TreeNode(2);
        TreeNode rootLeft = new TreeNode(3);
        root.left = rootLeft;
        ps.maxPathSum(root);
    }
}