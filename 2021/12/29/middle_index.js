/**
 * https://leetcode.com/problems/minimum-time-to-type-word-using-special-typewriter/
 * @author Andrew Jarombek
 * @since 12/29/2021
 */

const findMiddleIndex = function(nums) {
    let right = nums.reduce((acc, num) => acc + num, 0);
    let left = 0;

    for (let i = nums.length - 1; i >= 0; i--) {
        let num = nums[i];
        right -= num;

        if (left === right) {
            return i;
        }

        left += num;
    }

    return -1;
};