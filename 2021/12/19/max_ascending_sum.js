/**
 * https://leetcode.com/problems/maximum-ascending-subarray-sum/
 * @author Andrew Jarombek
 * @since 12/19/2021
 */

const maxAscendingSum = function(nums) {
    let max = 0;
    let current = 0;
    let previous = 0;

    for (let num of nums) {
        if (num > previous) {
            current += num;
        } else {
            current = num;
        }

        max = Math.max(max, current);

        previous = num;
    }

    return max;
};