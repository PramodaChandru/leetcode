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

import java.util.LinkedList;
import java.util.Queue;

/**
 1161. Maximum Level Sum of a Binary Tree
 Complexity:
 Time Complexity: O(n) - where n is the number of nodes in the tree
 Space Complexity: O(w) - w is the width the tree(queue holds the maximum nodes of the level)
 */
public class MaximumLevelSumOfABinaryTree {
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int maxValue = Integer.MIN_VALUE;
        int maxLevel = 1;
        int level = 1;

        while(!queue.isEmpty()) {
            int queueSize = queue.size();
            int levelSum = 0;
            for(int i = 0; i < queueSize; i++) {
                TreeNode node = queue.poll();
                levelSum += node.val;

                if(node.left != null) {
                    queue.offer(node.left);
                }

                if(node.right != null) {
                    queue.offer(node.right);
                }
            }

            if(levelSum > maxValue) {
                maxLevel = level;
                maxValue = levelSum;
            }
            level++;
        }

        return maxLevel;
    }
}