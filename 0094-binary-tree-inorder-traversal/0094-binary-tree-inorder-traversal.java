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
    // List to store the inorder traversal result
    private List<Integer> result = new ArrayList<>();

    /**
     * Performs inorder traversal of a binary tree
     * @param root The root node of the binary tree
     * @return List containing values in inorder sequence (left -> root -> right)
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        performInorderDFS(root);
        return result;
    }

    /**
     * Helper method to recursively traverse the tree in inorder
     * @param node Current node being processed
     */
    private void performInorderDFS(TreeNode node) {
        // Base case: if node is null, return
        if (node == null) {
            return;
        }
      
        // Traverse left subtree first
        performInorderDFS(node.left);
      
        // Process current node (add value to result list)
        result.add(node.val);
      
        // Traverse right subtree last
        performInorderDFS(node.right);
    }
}