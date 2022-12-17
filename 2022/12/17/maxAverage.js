/**
 * https://leetcode.com/problems/average-of-levels-in-binary-tree/
 * @author Andrew Jarombek
 * @since 12/17/2022
 */

const findMaxAverage = function(nums, k) {
    let sum = nums.slice(0, k).reduce((acc, val) => acc + val, 0);
    let result = sum / k;

    for (let i = k; i < nums.length; i++) {
        sum += nums[i];
        sum -= nums[i - k];
        result = Math.max(result, sum / k);
    }

    return result;
}

console.assert(findMaxAverage([1,12,-5,-6,50,3], 4) === 12.75);
console.assert(findMaxAverage([5], 1) === 5);
