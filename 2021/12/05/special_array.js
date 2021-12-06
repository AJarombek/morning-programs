/**
 * https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/
 * @author Andrew Jarombek
 * @since 12/5/2021
 */

const specialArray = function(nums) {
    nums.sort((a, b) => b - a);

    for (let i = 0; i < nums.length; i++) {
        if (nums[i] >= i + 1 && (i + 1 === nums.length || nums[i + 1] < i + 1)) {
            return i + 1;
        }
    }

    return -1;
};
