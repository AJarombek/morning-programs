/**
 * https://leetcode.com/problems/count-equal-and-divisible-pairs-in-an-array/
 * @author Andrew Jarombek
 * @since 3/3/2023
 */

function countPairs(nums: number[], k: number): number {
    let result = 0;

    for (let i = 0; i < nums.length; i++) {
        for (let j = i + 1; j < nums.length; j++) {
            if (nums[i] == nums[j] && i * j % k == 0) {
                result += 1;
            }
        }
    }

    return result;
}
