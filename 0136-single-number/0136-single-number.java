class Solution {
    public int singleNumber(int[] nums) {
        int singleNumber = nums[0];
        int length = nums.length;
        for (int index = 1; index < length; index++) {
            singleNumber = singleNumber ^ nums[index];
        }
        return singleNumber;
    }
}