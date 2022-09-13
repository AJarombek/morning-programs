/**
 * https://leetcode.com/problems/array-partition/
 * @author Andrew Jarombek
 * @since 9/12/2022
 */

const arrayPairSum = function(nums) {
    nums.sort((a, b) => a - b);
    return nums.reduce((acc, val, index) => index % 2 === 0 ? acc + val : acc);
};

console.assert(arrayPairSum([1, 2, 3, 4]) === 4);
