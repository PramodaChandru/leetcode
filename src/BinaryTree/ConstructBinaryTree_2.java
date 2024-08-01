package BinaryTree;

/**
 Given: Two integer arrays inorder and postorder, construct and return the binary tree

 Intuition:
 We know that in a postorder traversal the last element is the root node.
 Index of the this elements divides the tree into left and right subtrees.
 We can recursively apply this logic to construct the entire binary tree.

 Approach:
 1. Start with the last element of the postorder array as the root node
 2. In inorder array find the index of the root node
 3. Divide the array
 4. recursively construct the left and right subtrees 

 Complexity:
 Time Complexity:
 Time complexity of this algorithm is O(n)

 Space Complexity:
 Space Complexity of this algorithm is O(n)
 */
class ConstructBinaryTree_2 {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return constructTree(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1);
    }

    public TreeNode constructTree(int[] inorder, int iStart, int iEnd, int[] postorder, int pStart, int pEnd) {
        if(iStart > iEnd || pStart > pEnd) {
            return null;
        }

        int rootVal = postorder[pEnd];
        TreeNode root = new TreeNode(rootVal);

        int rootIndex = 0;
        for (int i = iStart; i <= iEnd; i++) {
            if(inorder[i] == rootVal) {
                rootIndex = i;
                break;
            }
        }

        int leftSize = rootIndex - iStart;
        int rightSize = iEnd - rootIndex;
        root.left = constructTree(inorder, iStart, rootIndex - 1, postorder, pStart, pStart + leftSize - 1);
        root.right = constructTree(inorder, rootIndex + 1, iEnd, postorder, pEnd - rightSize, pEnd - 1);

        return root;
    }

    public static void main(String[] args) {
        ConstructBinaryTree_2 b2 = new ConstructBinaryTree_2();
        b2.buildTree(new int[]{9,3,15,20,7}, new int[]{9,17,7,20,3});
    }
}