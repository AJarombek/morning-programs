/**
 * https://leetcode.com/problems/monotonic-array/
 * @author Andrew Jarombek
 * @since 10/13/2021
 */

const isMonotonic = function(nums) {
    const increasing = nums[0] < nums[nums.length - 1];
    let prev = nums[0];

    for (let i = 1; i < nums.length; i++) {
        if (increasing) {
            if (nums[i] >= prev) {
                prev = nums[i];
            } else {
                return false;
            }
        } else {
            if (nums[i] <= prev) {
                prev = nums[i];
            } else {
                return false;
            }
        }
    }

    return true;
};
