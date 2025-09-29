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
    // Global array to store the sorted input array
    private int[] nums;
  
    /**
     * Converts a sorted array to a height-balanced Binary Search Tree.
     * The strategy is to always choose the middle element as the root,
     * which ensures the tree remains balanced.
     * 
     * @param nums The sorted array to convert
     * @return The root node of the constructed BST
     */
    public TreeNode sortedArrayToBST(int[] nums) {
        // Store the array as instance variable for access in helper method
        this.nums = nums;
      
        // Build the tree recursively using the entire array range
        return buildBST(0, nums.length - 1);
    }
  
    /**
     * Recursively builds a BST from a sorted array segment.
     * Uses divide-and-conquer approach by selecting the middle element as root,
     * then recursively building left and right subtrees.
     * 
     * @param left The left boundary index (inclusive)
     * @param right The right boundary index (inclusive)
     * @return The root node of the subtree, or null if range is invalid
     */
    private TreeNode buildBST(int left, int right) {
        // Base case: invalid range means no nodes to create
        if (left > right) {
            return null;
        }
      
        // Calculate the middle index to maintain balance
        // Using bit shift for division by 2 (equivalent to (left + right) / 2)
        int middle = (left + right) >> 1;
      
        // Create the root node with middle element value
        // Recursively construct left subtree from left half
        // Recursively construct right subtree from right half
        return new TreeNode(
            nums[middle], 
            buildBST(left, middle - 1), 
            buildBST(middle + 1, right)
        );
    }
}