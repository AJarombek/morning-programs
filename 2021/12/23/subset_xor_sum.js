/**
 * https://leetcode.com/problems/sum-of-all-subset-xor-totals/
 * @author Andrew Jarombek
 * @since 12/23/2021
 */

const subsetXORSum = function(nums) {
    return backtrack(nums, 0, 0);
};

const backtrack = function(nums, index, value) {
    if (index === nums.length) {
        return value;
    }

    const x = backtrack(nums, index + 1, value);
    const y = backtrack(nums, index + 1, value ^ nums[index]);

    return x + y;
};