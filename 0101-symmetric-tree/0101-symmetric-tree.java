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
class Solution {
    /**
     * Determines if a binary tree is symmetric around its center.
     * A tree is symmetric if its left subtree is a mirror reflection of its right subtree.
     * 
     * @param root The root node of the binary tree
     * @return true if the tree is symmetric, false otherwise
     */
    public boolean isSymmetric(TreeNode root) {
        // Check if left and right subtrees are mirrors of each other
        return isMirror(root.left, root.right);
    }

    /**
     * Helper method to check if two trees are mirror images of each other.
     * Two trees are mirrors if:
     * 1. Both are null (base case)
     * 2. Both have same value and their children are mirrors in opposite positions
     * 
     * @param leftNode The root of the first tree
     * @param rightNode The root of the second tree
     * @return true if the two trees are mirrors, false otherwise
     */
    private boolean isMirror(TreeNode leftNode, TreeNode rightNode) {
        // If both nodes are the same reference (including both null), they're symmetric
        if (leftNode == rightNode) {
            return true;
        }
      
        // If only one is null or their values don't match, they're not symmetric
        if (leftNode == null || rightNode == null || leftNode.val != rightNode.val) {
            return false;
        }
      
        // Recursively check if:
        // - left's left child mirrors right's right child
        // - left's right child mirrors right's left child
        return isMirror(leftNode.left, rightNode.right) && 
               isMirror(leftNode.right, rightNode.left);
    }
}
