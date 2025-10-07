class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Initialize three pointers:
        // i: points to the last valid element in nums1
        // j: points to the last element in nums2
        // k: points to the last position in the merged array
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
      
        // Merge arrays from right to left
        // Continue until all elements from nums2 are processed
        while (j >= 0) {
            // Compare elements from both arrays and place the larger one at position k
            // If nums1 has remaining elements AND current element in nums1 is greater than nums2
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                // Otherwise, take element from nums2
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
        // Note: If i >= 0 after the loop, remaining elements in nums1 are already in place
    }
}
