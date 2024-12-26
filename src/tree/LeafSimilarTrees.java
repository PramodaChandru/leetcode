package tree;

import java.util.ArrayList;
import java.util.List;

public class LeafSimilarTrees {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leaf1 = new ArrayList<>();
        List<Integer> leaf2 = new ArrayList<>();
        dfsHelper(root1, leaf1);
        dfsHelper(root2, leaf2);

        return leaf1.equals(leaf2);
    }

    private void dfsHelper(TreeNode root, List<Integer> leafValues) {
        if(root == null) {
            return;
        }

        if(root.left == null && root.right == null) {
            leafValues.add(root.val);
        }
        dfsHelper(root.left, leafValues);
        dfsHelper(root.right, leafValues);
    }

}
