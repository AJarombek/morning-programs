/**
 * https://leetcode.com/problems/array-partition-i/
 * @author Andrew Jarombek
 * @since 3/29/2022
 */

function arrayPairSum(nums: number[]): number {
    nums.sort((a, b) => a - b);
    return nums.reduce((acc, val, index) => index % 2 == 0 ? val + acc : acc);
}