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
     * Determines if two binary trees are structurally identical
     * and have the same node values.
     * 
     * @param p The root node of the first binary tree
     * @param q The root node of the second binary tree
     * @return true if both trees are identical, false otherwise
     */
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // Base case: both nodes are the same reference (including both null)
        if (p == q) {
            return true;
        }
      
        // Check if one node is null while the other isn't, or if values differ
        if (p == null || q == null || p.val != q.val) {
            return false;
        }
      
        // Recursively check if left subtrees are identical AND right subtrees are identical
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
