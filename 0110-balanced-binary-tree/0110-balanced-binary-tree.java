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
     * Determines if a binary tree is height-balanced.
     * A binary tree is balanced if the depth difference between left and right subtrees
     * of every node is at most 1.
     * 
     * @param root The root node of the binary tree
     * @return true if the tree is balanced, false otherwise
     */
    public boolean isBalanced(TreeNode root) {
        // If height calculation returns -1, tree is unbalanced
        // Otherwise (height >= 0), tree is balanced
        return height(root) >= 0;
    }

    /**
     * Calculates the height of a subtree while checking for balance.
     * Returns -1 if the subtree is unbalanced.
     * 
     * @param root The root node of the subtree
     * @return The height of the subtree if balanced, -1 if unbalanced
     */
    private int height(TreeNode root) {
        // Base case: empty tree has height 0
        if (root == null) {
            return 0;
        }
      
        // Recursively calculate height of left subtree
        int leftHeight = height(root.left);
      
        // Recursively calculate height of right subtree
        int rightHeight = height(root.right);
      
        // Check if any subtree is unbalanced or height difference exceeds 1
        if (leftHeight == -1 || rightHeight == -1 || Math.abs(leftHeight - rightHeight) > 1) {
            // Propagate unbalanced state up the tree
            return -1;
        }
      
        // Return height of current subtree (1 + maximum child height)
        return 1 + Math.max(leftHeight, rightHeight);
    }
}