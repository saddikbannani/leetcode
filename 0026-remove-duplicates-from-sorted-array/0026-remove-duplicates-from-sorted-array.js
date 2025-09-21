var removeDuplicates = function(nums) {
    let numsLength = nums.length;
    for (let i = 0; i < numsLength; i++) {
        if (i >= nums.length) {
            break;
        }
        if (nums[i] === nums[i + 1]) {
            nums.splice(i, 1);
            i--;
        }
    }
};