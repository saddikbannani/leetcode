class Solution {
    public int searchInsert(int[] nums, int target) {
        // Initialize binary search boundaries
        // left: inclusive start index
        // right: exclusive end index (initially set to array length)
        int left = 0;
        int right = nums.length;
      
        // Binary search loop continues while search space is not empty
        while (left < right) {
            // Calculate middle index using unsigned right shift to avoid overflow
            // Equivalent to (left + right) / 2 but prevents integer overflow
            int mid = (left + right) >>> 1;
          
            // Check if middle element is greater than or equal to target
            if (nums[mid] >= target) {
                // Target is in the left half (including mid)
                // Move right boundary to mid (exclusive)
                right = mid;
            } else {
                // Target is in the right half (excluding mid)
                // Move left boundary to mid + 1 (inclusive)
                left = mid + 1;
            }
        }
      
        // Return the insertion position
        // At this point, left == right, representing the smallest index
        // where nums[index] >= target, or array length if target > all elements
        return left;
    }
}
