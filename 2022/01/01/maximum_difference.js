/**
 * https://leetcode.com/problems/maximum-difference-between-increasing-elements/
 * @author Andrew Jarombek
 * @since 1/1/2022
 */

const maximumDifference = function(nums) {
    let smallest = Infinity;
    let result = -1;

    for (let num of nums) {
        if (num > smallest) {
            result = Math.max(result, num - smallest);
        } else {
            smallest = num;
        }
    }

    return result;
};