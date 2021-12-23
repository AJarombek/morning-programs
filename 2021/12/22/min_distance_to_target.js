/**
 * https://leetcode.com/problems/minimum-distance-to-the-target-element/
 * @author Andrew Jarombek
 * @since 12/22/2021
 */

const getMinDistance = function(nums, target, start) {
    let offset = 0;

    while (start - offset >= 0 || start + offset < nums.length) {
        if (start - offset >= 0 && nums[start - offset] === target) {
            return offset;
        }

        if (start + offset < nums.length && nums[start + offset] === target) {
            return offset;
        }

        offset++;
    }

    return -1;
};