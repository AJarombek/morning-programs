/**
 * https://leetcode.com/problems/missing-number/
 * @author Andrew Jarombek
 * @since 2/25/2022
 */

function missingNumber(nums: number[]): number {
    let set = new Set(Array(nums.length + 1).keys());

    for (let num of nums) {
        set.delete(num);
    }

    return set.values().next().value;
}