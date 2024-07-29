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
class BT_SumRootLeaf {

    int sum=0;
    public int sumNumbers(TreeNode root) {
        helper(root,"");
        return sum;
    }
    public void helper(TreeNode root,String str){
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
        BT_PathSumII ps = new BT_PathSumII();
        TreeNode root = new TreeNode(2);
        TreeNode rootLeft = new TreeNode(3);
        root.left = rootLeft;
        ps.maxPathSum(root);
    }
}