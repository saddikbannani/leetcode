class Solution {
 public int[] twoSum(int[] nums, int target) {
    // formula 
    // num1 + num2 = target
    // target - num1 = num2
    // target - num2 = num1
    int[] res = new int[2];

    Map<Integer, Integer> map = new HashMap();

    for(int i = 0 ; i < nums.length ; i++) {
        // let us assume that nums[i] is one of the number of the pair
        int diff =  target - nums[i];
        // target - num1 = num2
        // so the diff should be in the map
        if (map.containsKey(diff)) {
            int index = map.get(diff);
            res[0] = i;
            res[1] = index;
        } else {
            // if the diff is not in the map yet then just add to the map
            // because there is one result available
            // so a number may be found in future 
            // target - nums[future] = diff, the diff will already be present in the map
            map.put(nums[i], i);
        }
    }

    return res;
}
}