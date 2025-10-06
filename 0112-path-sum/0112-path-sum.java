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
     * Determines if the tree has a root-to-leaf path such that the sum equals targetSum.
     * 
     * @param root The root of the binary tree
     * @param targetSum The target sum to find in a root-to-leaf path
     * @return true if such a path exists, false otherwise
     */
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return dfs(root, targetSum);
    }

    /**
     * Depth-first search helper method to find a path with the remaining sum.
     * 
     * @param node The current node being examined
     * @param remainingSum The remaining sum needed to reach the target
     * @return true if a valid path is found from this node to a leaf, false otherwise
     */
    private boolean dfs(TreeNode node, int remainingSum) {
        // Base case: if node is null, no valid path exists
        if (node == null) {
            return false;
        }
      
        // Subtract current node's value from the remaining sum
        remainingSum -= node.val;
      
        // Check if we've reached a leaf node with the exact remaining sum of 0
        if (node.left == null && node.right == null && remainingSum == 0) {
            return true;
        }
      
        // Recursively check left and right subtrees
        // Return true if either subtree contains a valid path
        return dfs(node.left, remainingSum) || dfs(node.right, remainingSum);
    }
}
