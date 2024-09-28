package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 199. Binary Tree Right Side View
 * Complexity:
 *
 *  Time complexity: O(N) - all the nodes are visited once
 *  Space Complexity: O(N) in the worst case (for both the queue and result list).
 *  In a balanced tree, the space complexity can be closer to O(log N) due to the height of the tree
 */
public class BinaryTreeRightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        if(root == null)
            return new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> result = new ArrayList<>();
        q.offer(root);
        while(!q.isEmpty()) {
            int size = q.size();
            while (size -- > 0){
                TreeNode temp = q.poll();
                if(size == 0) {
                    result.add(temp.val);
                }
                if(temp.left != null) {
                    q.offer(temp.left);
                }
                if(temp.right != null) {
                    q.offer(temp.right);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        BinaryTreeRightSideView bt = new BinaryTreeRightSideView();
        TreeNode root = new TreeNode(2);
        TreeNode rootLeft = new TreeNode(3);
        TreeNode rootRight = new TreeNode(4);
        root.left = rootLeft;
        root.right = rootRight;
        bt.rightSideView(root);
        System.out.println(bt.rightSideView(root));
    }
}
